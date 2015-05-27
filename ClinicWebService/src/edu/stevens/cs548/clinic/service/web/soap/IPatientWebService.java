package edu.stevens.cs548.clinic.service.web.soap;

import edu.stevens.cs548.clinic.domain.IProviderDAO.ProviderExn;
import edu.stevens.cs548.clinic.domain.Provider;
import edu.stevens.cs548.clinic.service.dto.patient.PatientDto;
import edu.stevens.cs548.clinic.service.dto.provider.ProviderDto;
import edu.stevens.cs548.clinic.service.dto.treatment.TreatmentDto;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
		name="IPatientWebPort",
		targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap")
// Endpoint interface for the patient web service
public interface IPatientWebService {
	public class PatientServiceExn extends Exception {
		private static final long serialVersionUID = 1L;

		public PatientServiceExn(String m) {
			super(m);
		}
	}

	public class ProviderServiceExn extends Exception {
		private static final long serialVersionUID = 1L;

		public ProviderServiceExn(String m) {
			super(m);
		}
	}

	public class TreatmentServiceExn extends Exception {
		private static final long serialVersionUID = 1L;

		public TreatmentServiceExn(String m) {
			super(m);
		}
	}

	public class PatientNotFoundExn extends PatientServiceExn {
		private static final long serialVersionUID = 1L;

		public PatientNotFoundExn(String m) {

			super(m);
		}

	}

	public class ProviderNotFoundExn extends ProviderServiceExn {
		private static final long serialVersionUID = 1L;

		public ProviderNotFoundExn(String m) {

			super(m);
		}

	}

	public class TreatmentNotFoundExn extends TreatmentServiceExn {
		private static final long serialVersionUID = 1L;

		public TreatmentNotFoundExn(String m) {

			super(m);
		}

	}

	@WebMethod
	public long createPatient(String name, Date dob, int age, long patientId)
			throws PatientServiceExn;

	@WebMethod
	@WebResult(
			name="PatientDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/patient")
	public PatientDto getPatientByDbId(long id) throws PatientServiceExn;

	@WebMethod
	@WebResult(
			name="PatientDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/patient")
	public PatientDto getPatientByPatId(long pid) throws PatientServiceExn;

	@WebMethod
	@WebResult(
			name="PatientDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/patient")
	public PatientDto[] getPatientByNameDob(String name, Date dob)
			throws PatientServiceExn;

	@WebMethod
	public void deletePatient(String name, long id) throws PatientServiceExn;

	@WebMethod
	public long createProvider(String name, long providerId)
			throws ProviderServiceExn;

	@WebMethod
	@WebResult(
			name="ProviderDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/provider")
	public ProviderDto[] getProviderByName(String name)
			throws ProviderServiceExn;

	@WebMethod
	@WebResult(
			name="ProviderDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/provider")
	public ProviderDto getProviderByNpi(long npi) throws ProviderServiceExn;

	@WebMethod
	public long addDrugTreatment(long id, long npi, String drug,
			float dosage) throws PatientNotFoundExn, ProviderNotFoundExn, ProviderExn;

	@WebMethod
	public long addSurgery(long id, long npi,  Date date)
			throws PatientNotFoundExn, ProviderNotFoundExn, ProviderExn;

	@WebMethod
	public long addRadiology(long id, long npi, List<Date> dates)
			throws PatientNotFoundExn, ProviderNotFoundExn, ProviderExn;

	@WebMethod
	public void deleteTreatment(long id, long tid) throws PatientNotFoundExn,
			TreatmentNotFoundExn, PatientServiceExn;

	@WebMethod
	@WebResult(
			name="TreatmentDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/treatment")
	public TreatmentDto[] getTreatmentsByPatient(long id)
			throws PatientNotFoundExn, TreatmentNotFoundExn, PatientServiceExn;

	@WebMethod
	@WebResult(
			name="TreatmentDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/treatment")
	public TreatmentDto[] getTreatmentsByProvider(long npi)
			throws ProviderNotFoundExn, TreatmentNotFoundExn;

	@WebMethod
	@WebResult(
			name="TreatmentDto",
			targetNamespace="http://cs548.stevens.edu/clinic/service/web/data/treatment")
	
	public TreatmentDto[] getTreatmentsByProvPat(long npi, long pid)
			throws PatientNotFoundExn, ProviderNotFoundExn,
			TreatmentNotFoundExn, PatientServiceExn, ProviderServiceExn;

	public String siteInfo();
}
