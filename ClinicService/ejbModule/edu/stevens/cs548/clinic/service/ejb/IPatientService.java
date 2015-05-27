package edu.stevens.cs548.clinic.service.ejb;

import java.util.Date;
import java.util.List;

import edu.stevens.cs548.clinic.domain.IProviderDAO.ProviderExn;
import edu.stevens.cs548.clinic.domain.Provider;
import edu.stevens.cs548.clinic.service.dto.patient.PatientDto;
import edu.stevens.cs548.clinic.service.dto.provider.ProviderDto;
import edu.stevens.cs548.clinic.service.dto.treatment.TreatmentDto;

public interface IPatientService {

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

	public long createPatient(String name, Date dob, int age, long patientId)
			throws PatientServiceExn;

	
	
	public PatientDto getPatientByDbId(long id) throws PatientServiceExn;

	public PatientDto getPatientByPatId(long pid) throws PatientServiceExn;

	public PatientDto[] getPatientByNameDob(String name, Date dob)
			throws PatientServiceExn;
	
	public void deletePatient(String name, long id) throws PatientServiceExn;

	//
	//
	public long createProvider(String name, long providerId) throws ProviderServiceExn;
	public ProviderDto[] getProviderByName(String name)	throws ProviderServiceExn;
	public ProviderDto getProviderByNpi(long npi) throws ProviderServiceExn;

	
	//
	//
	public long addDrugTreatment(long pid, long npi, String drug,
			float dosage) throws PatientNotFoundExn,ProviderNotFoundExn, ProviderExn;

	public long addSurgery(long pid, long npi, Date date)
			throws PatientNotFoundExn,ProviderNotFoundExn, ProviderExn;

	public long addRadiology(long pid, long npi, List<Date> dates)
			throws PatientNotFoundExn,ProviderNotFoundExn, ProviderExn;
	
	public void deleteTreatment(long id, long tid) throws PatientNotFoundExn,
			TreatmentNotFoundExn, PatientServiceExn;

	public TreatmentDto[] getTreatmentsByPatient(long id)
			throws PatientNotFoundExn, TreatmentNotFoundExn, PatientServiceExn;

	public TreatmentDto[] getTreatmentsByProvider(long npi)
			throws ProviderNotFoundExn, TreatmentNotFoundExn;

	
	public TreatmentDto[] getTreatmentsByProvPat(long npi,long pid)
			throws PatientNotFoundExn, ProviderNotFoundExn, TreatmentNotFoundExn, PatientServiceExn, ProviderServiceExn;

	public String siteInfo();
}
