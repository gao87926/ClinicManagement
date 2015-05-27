package edu.stevens.cs548.clinic.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("S")
public class Surgery extends Treatment implements Serializable {

	private static final long serialVersionUID = 1L;

	private String surgeon;
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getSurgeon() {
		return surgeon;
	}

	public void setSurgeon(String surgeon) {
		this.surgeon = surgeon;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void visit(ITreatmentVisitor visitor) {
		visitor.visitSurgery(this.getId(), this.getPatient(),
				this.getProvider(), this.getDate());
	}

	public Surgery() {
		super();
		this.setTreatmentType("S");

	}
}
