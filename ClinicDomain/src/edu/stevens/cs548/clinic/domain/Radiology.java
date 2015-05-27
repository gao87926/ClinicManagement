package edu.stevens.cs548.clinic.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class Radiology extends Treatment implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<Date> dates;
	
	public List<Date> getDates() {
		return dates;
	}
	
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
	
	public void visit(ITreatmentVisitor visitor) {
		visitor.visitRadiology(this.getId(),
				this.getPatient(),
				this.getProvider(),
				this.dates);
	}
}
