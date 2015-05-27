package edu.stevens.cs548.clinic.service.web.soap;

import java.nio.file.ProviderNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.sun.tools.ws.wsdl.document.jaxws.Exception;

import edu.stevens.cs548.clinic.domain.IProviderDAO.ProviderExn;
import edu.stevens.cs548.clinic.domain.Provider;
import edu.stevens.cs548.clinic.domain.IPatientDAO.PatientExn;
import edu.stevens.cs548.clinic.service.dto.patient.PatientDto;
import edu.stevens.cs548.clinic.service.dto.provider.ProviderDto;
import edu.stevens.cs548.clinic.service.dto.treatment.TreatmentDto;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.TreatmentNotFoundExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientServiceRemote;
import edu.stevens.cs548.clinic.service.web.soap.IPatientWebService;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.TreatmentNotFoundExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientServiceRemote;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderNotFoundExn;
@WebService(
		endpointInterface = "edu.stevens.cs548.clinic.service.web.soap.IPatientWebService", 
		targetNamespace = "http://cs548.stevens.edu/clinic/service/web/soap",
		serviceName = "PatientWebService", 
		portName = "PatientWebPort")
public class PatientWebService implements IPatientWebService {

	@EJB(beanName = "PatientServiceBean")
	IPatientServiceRemote service;

	@Override
	public long createPatient(String name, Date dob, int age, long patientId)
			throws PatientServiceExn {
		try {
			return service.createPatient(name, dob, age, patientId);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
			throw new PatientServiceExn(e.toString());
		}
	}

	
	@Override
	public PatientDto getPatientByDbId(long id) throws PatientServiceExn {
		try {
			return service.getPatientByDbId(id);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
			throw new PatientServiceExn(e.toString());
		}
	}

	@Override
	public PatientDto getPatientByPatId(long pid) throws PatientServiceExn {
		try {
			return service.getPatientByPatId(pid);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
			throw new PatientServiceExn(e.toString());
		}
	}

	@Override
	public PatientDto[] getPatientByNameDob(String name, Date dob)
			throws PatientServiceExn{
	
			try {
				return service.getPatientByNameDob(name, dob);
			} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
				throw new PatientServiceExn(e.toString());
			}
	

	}

	@Override
	public void deletePatient(String name, long id) throws PatientServiceExn {
		try {
			this.service.deletePatient(name, id);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
			throw new PatientServiceExn(e.toString());
		}
	}

	@Override
	public long addDrugTreatment(long id, long npi, String drug,
			float dosage) throws PatientNotFoundExn, ProviderNotFoundExn, ProviderExn {
		try {
			return this.service.addDrugTreatment(id, npi,drug, dosage);
		} catch (
				edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn
				| edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderNotFoundExn e) {

			throw new PatientNotFoundExn(e.toString());
		}
	}

	@Override
	public long addSurgery(long id, long npi, Date date)
			throws PatientNotFoundExn, ProviderNotFoundExn, ProviderExn {
		try {
			return this.service.addSurgery(id, npi, date);
		} catch (
				edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn
				| edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderNotFoundExn e) {

			throw new PatientNotFoundExn(e.toString());

		}

	}

	@Override
	public long addRadiology(long id, long npi, List<Date> dates)
			throws PatientNotFoundExn, ProviderNotFoundExn, ProviderExn {
		try {
			return this.service.addRadiology(id, npi, dates);
		} catch (
				edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn
				| edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderNotFoundExn e) {

			throw new PatientNotFoundExn(e.toString());

		}
	}
	
	@Override
	public ProviderDto getProviderByNpi(long npi) throws ProviderServiceExn {
		try {
			return service.getProviderByNpi(npi);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderServiceExn e) {
			throw new ProviderServiceExn(e.toString());
		}
		
	}
	@Override
	public ProviderDto[] getProviderByName(String name)
			throws ProviderServiceExn {
		try {
			return service.getProviderByName(name);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderServiceExn e) {
			throw new ProviderServiceExn(e.toString());
		}
		
	}

	@Override
	public long createProvider(String name, long providerId)
			throws ProviderServiceExn {
		try {
			return service.createProvider(name, providerId);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderServiceExn e) {
			throw new ProviderServiceExn(e.toString());
		}
		
	}
	
	
	@Override
	public TreatmentDto[] getTreatmentsByPatient(long id)
			throws PatientNotFoundExn, TreatmentNotFoundExn, PatientServiceExn {
		try {
			return service.getTreatmentsByPatient(id);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn e) {
			throw new PatientNotFoundExn(e.toString());
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.TreatmentNotFoundExn e) {
			throw new TreatmentNotFoundExn(e.toString());
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
			throw new PatientServiceExn(e.toString());
		}
	}
	
	@Override
	public TreatmentDto[] getTreatmentsByProvider(long npi)
			throws ProviderNotFoundExn, TreatmentNotFoundExn {
		try {
			return service.getTreatmentsByProvider(npi);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderNotFoundExn e) {
			throw new ProviderNotFoundException(e.toString());
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.TreatmentNotFoundExn e) {
			throw new TreatmentNotFoundExn(e.toString());
		}
	}
	@Override
	public TreatmentDto[] getTreatmentsByProvPat(long npi, long pid)
			throws PatientNotFoundExn, ProviderNotFoundExn,
			TreatmentNotFoundExn, PatientServiceExn, ProviderServiceExn {
	
			try {
				
					return service.getTreatmentsByProvPat(npi, pid);
				
			} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn e) {
				throw new PatientNotFoundExn(e.toString());
			} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.TreatmentNotFoundExn e) {
				throw new TreatmentNotFoundExn(e.toString());
			} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
				throw new PatientServiceExn(e.toString());
			}catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderNotFoundExn e) {
				throw new ProviderNotFoundException(e.toString());
			} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderServiceExn e) {
				throw new ProviderServiceExn(e.toString());
			}
			
		
	}

	@Override
	public void deleteTreatment(long id, long tid) throws PatientNotFoundExn,
			TreatmentNotFoundExn, PatientServiceExn {
		try {
			this.service.deleteTreatment(id, tid);
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn e) {
			throw new PatientNotFoundExn(e.toString());
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.TreatmentNotFoundExn e) {
			throw new TreatmentNotFoundExn(e.toString());
		} catch (edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn e) {
			throw new PatientServiceExn(e.toString());
		}

	}

	@Override
	public String siteInfo() {
		return service.siteInfo();
	}










}
