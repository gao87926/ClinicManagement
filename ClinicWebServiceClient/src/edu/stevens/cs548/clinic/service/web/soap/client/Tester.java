package edu.stevens.cs548.clinic.service.web.soap.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

import javax.xml.bind.DatatypeConverter;
import javax.xml.rpc.ServiceException;

import edu.stevens.cs548.clinic.service.web.data.patient.PatientDto;
import edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto;
import edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto;
import edu.stevens.cs548.clinic.service.web.data.treatment.DrugTreatmentType;
import edu.stevens.cs548.clinic.service.web.data.treatment.SurgeryType;
import edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto;
import edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto;
//import edu.stevens.cs548.clinic.service.web.soap.TreatmentDto;
import edu.stevens.cs548.clinic.service.web.soap.IPatientWebPort;
import edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn;
import edu.stevens.cs548.clinic.service.web.soap.PatientWebService;
import edu.stevens.cs548.clinic.service.web.soap.PatientWebServiceLocator;
import edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn;

public class Tester {

	private class ServiceError extends Exception {
		private static final long serialVersionUID = 5755181463947657850L;

		ServiceError(String s) {
			super(s);
		}
	}

	Logger logger = Logger
			.getLogger("edu.stevens.cs548.clinic.service.web.soap.client.Tester");

	/*
	 * Input file. Defaults to standard input.
	 */
	private String InputFileName = "<stdin>";

	private BufferedReader InputFile = new BufferedReader(
			new InputStreamReader(System.in));

	/*
	 * Output file. Defaults to standard output.
	 */
	private String OutputFileName;

	private PrintWriter OutputFile = new PrintWriter(new OutputStreamWriter(
			System.out));

	/*
	 * Endpoint URL for the Web service.
	 */
	private URL endpointUrl = null;

	/*
	 * Client proxy for the Web service. Generated from the endpoint URL.
	 */
	private IPatientWebPort patient = null;

	// private IPatientWebPort provider = null;

	/*
	 * Line number in input file, for error reporting.
	 */
	private int lineNo = 0;

	private String readLine() {
		/*
		 * Read a command from the input.
		 */
		try {
			lineNo++;
			return InputFile.readLine();
		} catch (IOException e) {
			error("Error reading input: " + e);
			return null;
		}
	}

	private void error(String msg) {
		if (lineNo > 0) {
			System.err.print(lineNo + ": ");
		}
		System.err.println("** Error **");
		System.err.println(msg);
		System.exit(-1);
	}

	private void remoteError(Exception e) {
		e.printStackTrace(System.err);
		error("Network error: " + e);
	}

	private void warning(String msg) {
		if (lineNo > 0) {
			System.err.print(lineNo + ": ");
		}
		System.err.println("** Warning **");
		System.err.println(msg);
	}

	private void print(String s) {
		OutputFile.print(s);
	}

	private void println(String s) {
		OutputFile.println(s);
	}

	private void newline() {
		OutputFile.println();
	}

	private void displayLong(long n) {
		OutputFile.print(n);
	}

	private void displayTreatment(String prefix, TreatmentDto t, String suffix) {
		print(prefix);
		logger.info("Displaying a treatment.");
		print("Treatment(){");
		print("Treatment Id=");
		print(String.valueOf(t.getId()));
		print(",treatment=");
		if (t.getDrugTreatment() != null) {
			DrugTreatmentType dt = t.getDrugTreatment();
			print("DrugTreatment{");
			print("name=");
			print(dt.getName());
			print(",dosage=");
			print(Float.toString(dt.getDosage()));
			print("}");
		} else if (t.getRadiology() != null) {
			String[] rad = t.getRadiology();

			print("Radiology{dates=[");
			for (int i = 0; i < rad.length - 1; i++) {
				print(rad[i]);
				print(",");
			}
			if (rad.length > 0) {
				print(rad[rad.length - 1]);
			}
			print("]}");
		} else if (t.getSurgery() != null) {
			SurgeryType st = t.getSurgery();
			print("Surgery{");
			print("date=");
			print(DateFormat.getInstance().format(st.getDate()));
			print("}");
		}
		print("}");
	}

	private void displayTreatmentList(TreatmentDto[] ts) {
		println("[");
		for (TreatmentDto t : ts) {
			displayTreatment("  ", t, ",\n");
		}
		println("]");
	}

	private void displayPatient(String prefix, PatientDto p, String suffix) {
		print(prefix);
		logger.info("Displaying a patient DTO.");
		print("Patient(");
		print(Long.toString(p.getId()));
		print("){");
		print("name=");
		print(p.getName());
		print(",birthDate=");
		print(DateFormat.getInstance().format(p.getDob().getTime()));
		print(",patientId=");
		print(Long.toString(p.getPatientId()));
		print("}");

	}

	private void displayProvider(String prefix, ProviderDto p, String suffix) {
		print(prefix);
		logger.info("Displaying a provider DTO.");
		print("Provider(");
		print(Long.toString(p.getId()));
		print("){");
		print("name=");
		print(p.getName());
		print(",spec=");
		print(p.getSpec());
		print(",providerNpi=");
		print(Long.toString(p.getNpi()));
		print("}");

	}

	private void displayPatient(PatientDto p) {
		displayPatient("", p, "\n");
	}

	private void displayProvider(ProviderDto p) {
		displayProvider("", p, "\n");
	}

	private void displayPatientList(PatientDto[] ps) {
		println("[");
		for (PatientDto p : ps) {
			displayPatient("  ", p, ",\n");
		}
		println("]");
	}

	private void displayProviderList(ProviderDto[] ps) {
		println("[");
		for (ProviderDto p : ps) {
			displayProvider("  ", p, ",\n");
		}
		println("]");
	}

	private long addPatient(String[] args) throws ServiceError {
		if (args.length != 4) {
			error("Usage: patient addPatient name dob patient-id age");
		}
		String name = args[0];
		Calendar dob = DatatypeConverter.parseDate(args[1]);
		long patientId = Long.parseLong(args[2]);
		int age = Integer.parseInt(args[3]);
		logger.info("Adding a patient (name=" + name + ").");
		try {
			return patient.createPatient(name, dob, age, patientId);
		} catch (PatientServiceExn e) {
			throw new ServiceError(e.toString());
		} catch (RemoteException e) {
			remoteError(e);
			return -1;
		}
	}

	private long addProvider(String[] args) throws ServiceError {
		if (args.length != 2) {
			error("Usage: Provider addProvider name provider-npi");
		}
		String name = args[0];
		long npi = Long.parseLong(args[1]);
		try {
			return patient.createProvider(name, npi);
		} catch (ProviderServiceExn e) {
			throw new ServiceError(e.toString());
		} catch (RemoteException e) {
			remoteError(e);
			return -1;
		}
	}

	private PatientDto getPatientByDbId(String[] args) throws ServiceError {
		if (args.length != 1) {
			error("Usage: patient getPatientByDbId patient-key");
		}
		long patientKey = Long.parseLong(args[0]);
		try {
			return patient.getPatientByDbId(patientKey);
		} catch (RemoteException e) {
			error("Network error: " + e);
			return null;
		} catch (Exception e) {
			throw new ServiceError(e.toString());
		}
	}

	private ProviderDto getProviderByNpi(String[] args) throws ServiceError {
		if (args.length != 1) {
			error("Usage: provider getProviderByName provider npi");
		}
		long npi = Long.parseLong(args[0]);
		logger.info("Getting a provider by provider-npi (" + npi + ").");
		try {
			return patient.getProviderByNpi(npi);
		} catch (RemoteException e) {
			error("Network error: " + e);
			return null;
		} catch (Exception e) {
			throw new ServiceError(e.toString());
		}
	}

	private PatientDto getPatientByPatId(String[] args) throws ServiceError {
		if (args.length != 1) {
			error("Usage: patient getPatientByPatId patient-id");
		}
		long patientId = Long.parseLong(args[0]);
		logger.info("Getting a patient by patient id (" + patientId + ").");
		try {
			return patient.getPatientByPatId(patientId);
		} catch (PatientServiceExn e) {
			throw new ServiceError(e.toString());
		} catch (RemoteException e) {
			remoteError(e);
			return null;
		}
	}

	private PatientDto[] getPatientsByNameDob(String[] args) {
		if (args.length != 2) {
			error("Usage: patient getPatientsByNameDob name dob");
		}
		String name = args[0];
		Calendar dob = DatatypeConverter.parseDate(args[1]);
		try {
			GetPatientByNameDobResponsePatientDto[] results = patient.getPatientByNameDob(name, dob);
			PatientDto[] dtos = new PatientDto[results.length];
			int ix = 0;
			for (GetPatientByNameDobResponsePatientDto result : results) {
				PatientDto dto = new PatientDto();
				dto.setDob(result.getDob());
				dto.setId(result.getId());
				dto.setName(result.getName());
				dto.setPatientId(result.getPatientId());
				dto.setTreatments(result.getTreatments());
				dtos[ix++] = dto;
			}
			return dtos;
		} catch (RemoteException e) {
			remoteError(e);
			return null;
		}
	}
	
	private ProviderDto[] getProvidersByName(String[] args) {
		if (args.length != 1) {
			error("Usage: provider getProvidersByName name ");
		}
		String name = args[0];
		try {
			GetProviderByNameResponseProviderDto[] results = patient
					.getProviderByName(name);
			ProviderDto[] dtos = new ProviderDto[results.length];
			int ix = 0;
			for (GetProviderByNameResponseProviderDto result : results) {
				ProviderDto dto = new ProviderDto();
				dto.setId(result.getId());
				dto.setName(result.getName());
				dto.setNpi(result.getNpi());
				dto.setSpec(null);
				dto.setTreatments(result.getTreatments());
				dtos[ix++] = dto;
			}
			return dtos;
		} catch (RemoteException e) {
			remoteError(e);
			return null;
		}
	}

	private void deletePatient(String[] args) throws ServiceError {
		if (args.length != 2) {
			error("Usage: patient deletePatient name key");
		}
		String name = args[0];
		long id = Long.parseLong(args[1]);
		try {
			patient.deletePatient(name, id);
		} catch (PatientServiceExn e) {
			throw new ServiceError(e.toString());
		} catch (RemoteException e) {
			remoteError(e);
		}
	}

	private void addDrugTreatment(String[] args) throws ServiceError {
		if (args.length != 4) {
			error("Usage: provider addDrugTreatment patient-id provider-npi drug dosage");
		}
		long pid = Long.parseLong(args[0]);
		long npi = Long.parseLong(args[1]);
		String drug = args[2];
		float dosage = Float.parseFloat(args[3]);
		try {
			patient.addDrugTreatment(pid, npi, drug, dosage);
		} catch (RemoteException e) {
			remoteError(e);
		}
	}

	private void addSurgery(String[] args) throws ServiceError, ParseException {
		if (args.length != 3) {
			error("Usage: provider addSurgery patient-id provider-npi date{YYYY-MM-DD}");
		}
		long pid = Long.parseLong(args[0]);
		long npi = Long.parseLong(args[1]);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(args[2]);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		try {
			patient.addSurgery(pid, npi, cal);

		} catch (RemoteException e) {
			remoteError(e);
		}
	}

	private void addRadiology(String[] args) throws ServiceError,
			ParseException {
		if (args.length < 2) {
			error("Usage: provider addRadiology patient-id provider-npi date(YYYY-MM-DD) [date, date...]");
		}
		long pid = Long.parseLong(args[0]);
		long npi = Long.parseLong(args[1]);
		Date[] dates = new Date[args.length - 2];
		logger.info("number of dates = " + dates.length);
		Calendar[] cals = new Calendar[args.length - 2];
		logger.info("number of cals = " + cals.length);

		for (int i = 0; i < cals.length; i++) {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date date = df.parse(args[2 + i]);
			Calendar cal = new GregorianCalendar();
			cal.setTime(date);
			cals[i] = cal;
		}
		try {
			Long tid;
			tid = patient.addRadiology(pid, npi, cals);
			logger.info("Radiology treatment has been added, tid = " + tid);
		} catch (RemoteException e) {
			remoteError(e);
		}

	}

	private TreatmentDto[] getTreatmentsByPatient(String[] args)
			throws ServiceError {
		if (args.length != 1) {
			error("Usage: patient getTreatments patient-key");
		}
		long id = Long.parseLong(args[0]);
		try {
			return patient.getTreatmentsByPatient(id);
		} catch (PatientServiceExn e) {
			throw new ServiceError(e.toString());
		} catch (RemoteException e) {
			error("Network error: " + e);
			return null;
		}
	}

	private TreatmentDto[] getTreatmentsByProvider(String[] args)
			throws ServiceError {
		if (args.length != 1) {
			error("Usage: provider getTreatments provider-npi");
		}
		long id = Long.parseLong(args[0]);
		try {
			return patient.getTreatmentsByProvider(id);
		} catch (PatientServiceExn e) {
			throw new ServiceError(e.toString());
		} catch (RemoteException e) {
			error("Network error: " + e);
			return null;
		}
	}

	private TreatmentDto[] getTreatmentsByProviderPatient(String[] args)
			throws ServiceError {
		if (args.length != 2) {
			error("Usage: provider getTreatmentsByProviderPatient provider-npi patient-key");
		}
		long npi = Long.parseLong(args[0]);
		long pid = Long.parseLong(args[1]);
		try {
			return patient.getTreatmentsByProvPat(npi, pid);
		} catch (PatientServiceExn e) {
			throw new ServiceError(e.toString());
		} catch (RemoteException e) {
			error("Network error: " + e);
			return null;
		}
	}

	private void deleteTreatment(String[] args) throws ServiceError {
		if (args.length != 2) {
			error("Usage: provider deleteTreatment patient-id tid");
		}
		long id = Long.parseLong(args[0]);
		long tid = Long.parseLong(args[1]);
		try {
			patient.deleteTreatment(id, tid);
			logger.info("delete treatement id = " + tid);
		} catch (RemoteException e) {
			remoteError(e);
		}

	}

	private String siteInfo(String[] args) {
		if (args.length > 0) {
			error("Usage: patient siteInfo");
			return null;
		}
		try {
			return patient.siteInfo();
		} catch (RemoteException e) {
			remoteError(e);
			return null;
		}
	}

	public void invokePatientService(String cmd, String[] args)
			throws ParseException {
		try {
			if ("addPatient".equals(cmd)) {
				displayLong(addPatient(args));
				newline();
			} else if ("getPatientByDbId".equals(cmd)) {
				displayPatient(getPatientByDbId(args));
				newline();
			} else if ("getPatientByPatId".equals(cmd)) {
				displayPatient(getPatientByPatId(args));
				newline();
			} else if ("getPatientByNameDob".equals(cmd)) {
				displayPatientList(getPatientsByNameDob(args));
				newline();
			} else if ("deletePatient".equals(cmd)) {
				deletePatient(args);
			} else if ("getTreatmentsByPatient".equals(cmd)) {
				displayTreatmentList(getTreatmentsByPatient(args));
				newline();
			} else if ("siteInfo".equals(cmd)) {
				println(siteInfo(args));
			} else {
				error("Unrecognized patient service command: " + cmd);
			}
		} catch (ServiceError e) {
			error("Service raised exception: " + e);
		}
	}

	public void invokeProviderService(String cmd, String[] args)
			throws ParseException {
		try {
			if ("addProvider".equals(cmd)) {
				displayLong(addProvider(args));
				newline();
			} else if ("getProviderByNpi".equals(cmd)) {
				displayProvider(getProviderByNpi(args));
				newline();
			} else if ("getProviderByName".equals(cmd)) {
				displayProviderList(getProvidersByName(args));
				newline();
			} else if ("deleteTreatment".equals(cmd)) {
				deleteTreatment(args);
				newline();
			} else if ("addDrugTreatment".equals(cmd)) {
				addDrugTreatment(args);
				newline();
			} else if ("addSurgery".equals(cmd)) {
				addSurgery(args);
				newline();
			} else if ("addRadiology".equals(cmd)) {
				addRadiology(args);
				newline();
			} else if ("getTreatmentsByProvider".equals(cmd)) {
				displayTreatmentList(getTreatmentsByProvider(args));
				newline();
			} else if ("getTreatmentsByProviderPatient".equals(cmd)) {
				displayTreatmentList(getTreatmentsByProviderPatient(args));
				newline();
			} else {
				error("Unrecognized patient service command: " + cmd);
			}
		} catch (ServiceError e) {
			error("Service raised exception: " + e);
		}
	}

	private String currentWorkingDir() {
		return new File(".").getAbsolutePath();
	}

	private Tester processArgs(String[] args) {
		/*
		 * Process the command line arguments:
		 * 
		 * --input filename -i filename File containing a list of commands.
		 * Default is standard input.
		 * 
		 * --output filename -o filename File to write out results of commands.
		 * Default is standard output.
		 * 
		 * --url endpoint-url -u endpoint-url Endpoint URL for the service. No
		 * default.
		 */
		for (int iarg = 0; iarg < args.length; iarg++) {
			if ("--input".equals(args[iarg]) || "-i".equals(args[iarg])) {
				if (iarg + 1 < args.length) {
					InputFileName = args[++iarg];
					try {
						InputFile = new BufferedReader(new FileReader(
								InputFileName));
					} catch (FileNotFoundException e) {
						error("Input file not found: " + InputFileName
								+ "\nDirectory: " + currentWorkingDir());
					}
				} else {
					error("Missing value for --input or -i option.");
				}
			} else if ("--output".equals(args[iarg]) || "-o".equals(args[iarg])) {
				if (iarg + 1 < args.length) {
					OutputFileName = args[++iarg];
					try {
						OutputFile = new PrintWriter(new FileWriter(
								OutputFileName));
					} catch (IOException e) {
						error("Problem opening output file: " + OutputFileName
								+ "\nDirectory: " + currentWorkingDir());
					}
				} else {
					error("Missing value for --output or -o option");
				}
			} else if ("--url".equals(args[iarg]) || "-u".equals(args[iarg])) {
				if (iarg + 1 < args.length) {
					try {
						endpointUrl = new URL(args[++iarg]);
						PatientWebService service = new PatientWebServiceLocator();
						this.patient = service.getPatientWebPort(endpointUrl);
						// this.patient = service.getPatientWebPort();
					} catch (MalformedURLException e) {
						error("Bad service URL: " + args[iarg]);
					} catch (ServiceException e) {
						error("Service exception: " + e);
					}
				}
			}
		}

		if (this.patient == null) {
			error("You must specify an endpoint URL with the --url or -u option.");
		}

		return this;
	}

	private void processLine(String[] args) throws ParseException {
		if (args.length < 2) {
			error("Usage: (patient|provider) command arg1 ... argn");
		} else if ("patient".equals(args[0])) {
			invokePatientService(args[1],
					Arrays.copyOfRange(args, 2, args.length));
		} else if ("provider".equals(args[0])) {
			invokeProviderService(args[1],
					Arrays.copyOfRange(args, 2, args.length));
		} else {
			error("Service name must be \"patient\" or \"provider\".");
		}
	}

	private void processLines() throws ParseException {
		String line;
		while ((line = this.readLine()) != null) {
			String[] args = line.split("\\s");
			processLine(args);
		}
		try {
			InputFile.close();
		} catch (IOException e) {
			warning("Failed to close input: " + e);
		}
		OutputFile.close();
	}

	public Tester() {
	}

	public static void main(String[] args) throws ParseException {
		new Tester().processArgs(args).processLines();
	}

}