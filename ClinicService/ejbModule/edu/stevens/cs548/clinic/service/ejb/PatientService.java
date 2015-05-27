package edu.stevens.cs548.clinic.service.ejb;

import edu.stevens.cs548.clinic.domain.IPatientDAO;
import edu.stevens.cs548.clinic.domain.IPatientDAO.PatientExn;
import edu.stevens.cs548.clinic.domain.IProviderDAO.ProviderExn;
import edu.stevens.cs548.clinic.domain.IProviderDAO;
import edu.stevens.cs548.clinic.domain.ITreatmentDAO.TreatmentExn;
import edu.stevens.cs548.clinic.domain.ITreatmentVisitor;
import edu.stevens.cs548.clinic.domain.Patient;
import edu.stevens.cs548.clinic.domain.PatientDAO;
import edu.stevens.cs548.clinic.domain.PatientFactory;
import edu.stevens.cs548.clinic.domain.ProviderDAO;
import edu.stevens.cs548.clinic.domain.ProviderFactory;


import edu.stevens.cs548.clinic.domain.Provider;
import edu.stevens.cs548.clinic.service.dto.treatment.DrugTreatmentType;
import edu.stevens.cs548.clinic.service.dto.patient.PatientDto;
import edu.stevens.cs548.clinic.service.dto.patient.PatientDtoFactory;
import edu.stevens.cs548.clinic.service.dto.provider.ProviderDto;
import edu.stevens.cs548.clinic.service.dto.provider.ProviderDtoFactory;
import edu.stevens.cs548.clinic.service.dto.treatment.RadiologyType;
import edu.stevens.cs548.clinic.service.dto.treatment.SurgeryType;
import edu.stevens.cs548.clinic.service.dto.treatment.TreatmentDto;
import edu.stevens.cs548.clinic.service.dto.treatment.ObjectFactory;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientNotFoundExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.PatientServiceExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderNotFoundExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.ProviderServiceExn;
import edu.stevens.cs548.clinic.service.ejb.IPatientService.TreatmentNotFoundExn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class PatientService
 */
@Stateless(name="PatientServiceBean")
public class PatientService implements IPatientServiceLocal, IPatientServiceRemote {

	private PatientFactory patientFactory;
	private ProviderFactory providerFactory;
	private PatientDtoFactory patDtoFactory = new PatientDtoFactory();
	private ProviderDtoFactory provDtoFactory = new ProviderDtoFactory();
	private IPatientDAO patientDAO;
	private IProviderDAO providerDAO;
	

    /**
     * Default constructor. 
     */
    public PatientService() {
         patientFactory = new PatientFactory();
         providerFactory = new ProviderFactory();
    	//patientDAO = new PatientDAO(this.em);
    }
    
	@PersistenceContext(unitName="ClinicDomain")
	private EntityManager em;

	
	//Initial after dependency injection
	@PostConstruct
	private void initialize(){
		patientDAO = new PatientDAO(em);
		providerDAO = new ProviderDAO(em);
	}



	/**
     * @see IPatientService#deletePatient(String, long)
     */
    public void deletePatient(String name, long id)throws PatientServiceExn {
    	try {
			Patient patient =patientDAO.getPatientByDbId(id);
			if(!name.equals(patient.getName())){
				throw new PatientServiceExn("Tried to delete wrong patient: name = " + name +", id" + id);
			}else{
				   patientDAO.deletePatient(patient);
			}
		} catch (PatientExn e) {
		throw new PatientServiceExn(e.toString());
		}
    
    }

	/**
     * @see IPatientService#getPatientByDbId(long)
     */
    public PatientDto getPatientByDbId(long id) throws PatientServiceExn {
       try{
    	   Patient patient = patientDAO.getPatientByDbId(id);
    	   return  patDtoFactory.createPatientDto(patient);
       }catch(PatientExn e){
    	   throw new PatientServiceExn(e.toString());
       }
      
    }

	/**
     * @see IPatientService#getPatientByNameDob(String, Date)
     */
    public PatientDto[] getPatientByNameDob(String name, Date dob) {

    	List<Patient> patients = patientDAO.getPatientByNameDob(name, dob);
    	PatientDto[] dto= new PatientDto[patients.size()];
    	
    	for(int i = 0; i< dto.length; i++){
    		dto[i] = patDtoFactory.createPatientDto(patients.get(i));
    	}
    	return dto;	
    }
    
	@Override
	public ProviderDto[] getProviderByName(String name)	throws ProviderServiceExn {
		List<Provider> providers = providerDAO.getProviderByName(name);
		ProviderDto[] dto = new ProviderDto[providers.size()];
		for(int i = 0; i<dto.length; i++){
			dto[i] = provDtoFactory.createPatientDto(providers.get(i));
			
		}
		
		return dto;
	}

	/**
     * @see IPatientService#getPatientByPatId(long)
     */
    public PatientDto getPatientByPatId(long pid) throws PatientServiceExn{
        try{
     	   Patient patient = patientDAO.getPatientByPatientId(pid);
     	   return  patDtoFactory.createPatientDto(patient);
        }catch(PatientExn e){
     	   throw new PatientServiceExn(e.toString());
        }
    }
    

	@Override
	public ProviderDto getProviderByNpi(long npi) throws ProviderServiceExn {
		try{
			Provider provider = providerDAO.getProviderByProviderId(npi);
			return provDtoFactory.createPatientDto(provider);
		}catch(ProviderExn e){
			throw new ProviderServiceExn(e.toString());
		}
	}
	/**
     * @see IPatientService#createPatient(String, Date, long)
     */
    public long createPatient(String name, Date dob,int age, long patientId) throws PatientServiceExn{

    	Patient patient = this.patientFactory.createPatient(name, dob, age, patientId);
    	//long pdbId = 0;
    	
    	try {
    		 patientDAO.addPatient(patient);
		} catch (PatientExn e) {
			throw new PatientServiceExn(e.toString());
		}
    	return patient.getId();
    }


	@Override
	public long createProvider(String name, long npi)throws ProviderServiceExn {
		
		Provider provider = this.providerFactory.createProvider(npi, name,"NA");
		try{
			providerDAO.addProvider(provider);
		}catch(ProviderExn e){
			throw new ProviderServiceExn(e.toString());
		}
		return provider.getId();
	}

//make addDrug from provider, send in a patient as arg
	@Override
	public long addDrugTreatment(long patId, long npi, String drug,
			float dosage) throws PatientNotFoundExn, ProviderExn {
		long tid;
		try{
			Provider provider = providerDAO.getProviderByProviderId(npi);
			Patient patient = patientDAO.getPatientByPatientId(patId);
			tid = provider.addDrugTreatment(patient, drug, dosage);
		}catch(PatientExn e){
				throw new PatientNotFoundExn(e.toString());
				
			}
			return tid;
	}
	@Override
	public long addSurgery(long pid, long npi, Date date) throws PatientNotFoundExn, ProviderExn {
		long tid;
		try{
			Patient patient = patientDAO.getPatientByPatientId(pid);
			Provider provider = providerDAO.getProviderByProviderId(npi);
			tid = provider.addSurgery(patient, provider.getName(), date);
		}catch(PatientExn e){
				throw new PatientNotFoundExn(e.toString());
				
			}
			return tid;
	}
	@Override
	public long addRadiology(long pid, long npi, List<Date> dates) throws PatientNotFoundExn, ProviderExn {
		long tid;
		try{
			Patient patient = patientDAO.getPatientByPatientId(pid);
			Provider provider = providerDAO.getProviderByProviderId(npi);
			tid = provider.addRadiology(patient, dates);
		}catch(PatientExn e){
				throw new PatientNotFoundExn(e.toString());
				
			}
			return tid;
	}

static class Treatment_PDO_to_DTO implements ITreatmentVisitor{
private ObjectFactory factory = new ObjectFactory();
	private TreatmentDto dto;
	public TreatmentDto getDTO(){return dto;}
	
		
	@Override
	public void visitDrugTreatment(long tid,Patient pat, Provider prov,	String drug, float dosage){
		dto = factory.createTreatmentDto();
		//dto.setDiagnosis(diagnosis);	dto.setDrugTreatment(drugInfo);
		DrugTreatmentType drugInfo = factory.createDrugTreatmentType();
		drugInfo.setDosage(dosage);
		drugInfo.setName(drug);
		dto.setDrugTreatment(drugInfo);
		dto.setId(tid);
	}

	@Override
	public void visitSurgery(long tid,Patient pat, Provider provider, Date date) {
		dto = factory.createTreatmentDto();
		//dto.setDiagnosis(diagnosis);
		SurgeryType SurgeryInfo = factory.createSurgeryType();
		SurgeryInfo.setDate(date);
		dto.setSurgery(SurgeryInfo);
		dto.setId(tid);
	}

	@Override
	public void visitRadiology(long tid,Patient pat, Provider provider,	List<Date> dates){
		dto = factory.createTreatmentDto();
		//dto.setDiagnosis(diagnosis);
		RadiologyType RadiologyInfo = factory.createRadiologyType();
		//String sf = new SimpleDateFormat("yyyy-MM-dd").parse;
		List<String> sl = new ArrayList<String>();
		DateFormat  df = new SimpleDateFormat("dd-MM-yyyy");
		for(Date date: dates){
			sl.add(df.format(date));
		}
		RadiologyInfo.getDate().addAll(sl);
		dto.setRadiology(RadiologyInfo);
		dto.setId(tid);
		
	}
	
}
	
	@Override
	public TreatmentDto[] getTreatmentsByPatient(long id)
			throws PatientNotFoundExn, TreatmentNotFoundExn, PatientServiceExn {
		try{
			Patient patient = patientDAO.getPatientByDbId(id);
			List<Long> tids;
			tids = patient.getTreatmentIds();
			TreatmentDto[] treatments = new TreatmentDto[tids.size()];
			Treatment_PDO_to_DTO visitor = new Treatment_PDO_to_DTO();
			for(int i= 0; i<tids.size(); i++){
				
				patient.visitTreatment(tids.get(i), visitor);
				treatments[i] = visitor.getDTO();
				}
			return treatments;
		}catch(PatientExn e){
			throw new PatientNotFoundExn(e.toString());
		}catch (TreatmentExn e) {
			throw new PatientServiceExn(e.toString());
		}
	}


	@Override
	public TreatmentDto[] getTreatmentsByProvider(long npi)
			throws ProviderNotFoundExn, TreatmentNotFoundExn {
		try{
			Provider provider = providerDAO.getProviderByProviderId(npi);
			List<Long> tids;
			tids = provider.getTreatmentIds();
			TreatmentDto[] treatments = new TreatmentDto[tids.size()];
			Treatment_PDO_to_DTO visitor = new Treatment_PDO_to_DTO();
			for(int i= 0; i<tids.size(); i++){
				
				provider.visitTreatment(tids.get(i), visitor);
				treatments[i] = visitor.getDTO();
				}
			return treatments;
		}catch(ProviderExn e){
			throw new ProviderNotFoundExn(e.toString());
		}catch (TreatmentExn e) {
			throw new TreatmentNotFoundExn(e.toString());
		}
	}



	@Override
	public TreatmentDto[] getTreatmentsByProvPat(long npi,long pid)
			throws PatientNotFoundExn, ProviderNotFoundExn, TreatmentNotFoundExn, PatientServiceExn, ProviderServiceExn
	{
			try{
			Provider provider = providerDAO.getProviderByProviderId(npi);
			Patient patient = patientDAO.getPatientByDbId(pid);
			List<Long> tids;
			tids = provider.getTreatmentIds(patient);
			TreatmentDto[] treatments = new TreatmentDto[tids.size()];
			Treatment_PDO_to_DTO visitor = new Treatment_PDO_to_DTO();
			for(int i= 0; i<tids.size(); i++){
				
				provider.visitTreatment(tids.get(i), visitor);
				treatments[i] = visitor.getDTO();
				}
			return treatments;
		}catch(ProviderExn e){
			throw new ProviderNotFoundExn(e.toString());
		}catch (TreatmentExn e) {
			throw new TreatmentNotFoundExn(e.toString());
		} catch (PatientExn e) {
			throw new PatientServiceExn(e.toString());
		}
	}
	
	@Override
	public void deleteTreatment(long id, long tid) throws PatientNotFoundExn,
			TreatmentNotFoundExn, PatientServiceExn {
		try{
			Patient patient = patientDAO.getPatientByDbId(id);
			patient.deleteTreatment(tid);
		}catch(PatientExn e){
			throw new PatientNotFoundExn(e.toString());
		}catch(TreatmentExn e){
			throw new PatientServiceExn(e.toString());
		}
		
	}

	@Resource(name="SiteInfo")
	private String siteInformation;

	@Override
	public String siteInfo() {
		return siteInformation;
	}

















}
