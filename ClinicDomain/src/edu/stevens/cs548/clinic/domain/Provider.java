package edu.stevens.cs548.clinic.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import edu.stevens.cs548.clinic.domain.ITreatmentDAO.TreatmentExn;
/**
 * Entity implementation class for Entity: Provider
 *
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "SearchProviderByName", 
			query = "select p from Provider p where p.name = :name"),
	@NamedQuery(name = "SearchProviderByProviderID", 
			query = "select p from Provider p where p.npi = :npi") })
@Inheritance(strategy = InheritanceType.JOINED)

@Table(name = "PROVIDER")
public class Provider implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private long npi;
	private String name;
	private String spec;
	
	// GETER and SETTER
	
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getProviderId() {
		return npi;
	}

	public void setProviderId(long npi) {
		this.npi = npi;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	@OneToMany(mappedBy = "provider")
	@OrderBy
	private List<Treatment> treatments;

	protected List<Treatment> getTreatments() {
		return treatments;
	}
	
	public void setTreatments(List<Treatment> treatments) {
		this.treatments = treatments;
	}

	@Transient
	private ITreatmentDAO treatmentDAO;
	
	public void setTreatmentDAO (ITreatmentDAO tdao){
		this.treatmentDAO = tdao;
		}
	 	
	 	
 	public long addTreatment(Treatment t){
 		long tid = this.treatmentDAO.addTreatment(t);
 		this.getTreatments().add(t);
 		if(t.getProvider() != this)
		 t.setProvider(this);
 		return tid;
 	}
	public long addDrugTreatment(Patient patient, String drug, float dosage){
 		DrugTreatment treatment = new DrugTreatment();
 		treatment.setPatient(patient);
 		treatment.setProvider(this);
 		//treatment.setDiagnosis(diagnosis);
 		treatment.setDrug(drug);
 		treatment.setDosage(dosage);
 		return this.addTreatment(treatment);
 		 		
 	}
	public long addSurgery(Patient patient,  String surgeon, Date date){
 		Surgery treatment = new Surgery();
 		//treatment.setDiagnosis(diagnosis);
 		treatment.setProvider(this);
 		treatment.setPatient(patient);
 		treatment.setSurgeon(surgeon);
 		treatment.setDate(date);
 		return this.addTreatment(treatment);
 		
 	}
 	public long addRadiology(Patient patient,  List<Date> dates){
 		Radiology treatment = new Radiology();
 		//treatment.setDiagnosis(diagnosis);
 		treatment.setProvider(this);
 		treatment.setPatient(patient);
 		treatment.setDates(dates);
 		return this.addTreatment(treatment);
 		
 	}
 	public List<Long> getTreatmentIds(){
 		List<Long> tids = new ArrayList<Long>();
 		for(Treatment t: this.getTreatments()){
 			tids.add(t.getId());
 		}
 		return tids;
 	}
 	
 	public List<Long> getTreatmentIds(Patient patient){
 		List<Long> tids = new ArrayList<Long>();
 		for(Treatment t: this.getTreatments()){
 			if(t.getPatient()==patient){
 			tids.add(t.getId());
 			}
 		}
 		return tids;
 	}
 	
 	public void visitTreatment(long tid, ITreatmentVisitor visitor) throws TreatmentExn {
 		Treatment t = treatmentDAO.getTreatmentByDbId(tid);
 		if(t.getProvider() != this){
 			throw new TreatmentExn("Inappropriate treatment access: provider = " + id +
 					", treatment = " + tid);
 		}
 		t.visit(visitor);
 	}
 	public void deleteTreatment(long tid) throws TreatmentExn{
 		Treatment t = treatmentDAO.getTreatmentByDbId(tid);
 		if(t.getProvider() != this){
 			throw new TreatmentExn("Inappropriate treatment access: provider = " + id +
 					", treatment = " + tid);
 		}
 		treatmentDAO.deleteTreatment(t);
 	}

 	public void visitTreatments(ITreatmentVisitor visitor){
 		for (Treatment t: this.getTreatments()){
 			t.visit(visitor);
 		}
 	}

 		public Provider() {
 			super();
 			treatments = new ArrayList<Treatment>();
 		}
}
