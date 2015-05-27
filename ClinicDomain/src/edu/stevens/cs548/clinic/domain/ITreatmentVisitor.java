package edu.stevens.cs548.clinic.domain;

import java.util.Date;
import java.util.List;

public interface ITreatmentVisitor {

	public void visitDrugTreatment(long tid,Patient pat, Provider prov,	String drug, float dosage);

	public void visitRadiology(long tid,Patient pat, Provider provider,	List<Date> dates);

	public void visitSurgery(long tid,Patient pat, Provider provider, Date date);

}
