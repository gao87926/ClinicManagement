package edu.stevens.cs548.clinic.service.dto.patient;

import edu.stevens.cs548.clinic.domain.Patient;

public class PatientDtoFactory {
	
	ObjectFactory factory;
	
	public PatientDtoFactory() {
		factory = new ObjectFactory();
	}
	
	public PatientDto createPatientDto (Patient p) {
		PatientDto d = factory.createPatientDto();
		/*
		 * TODO: Initialize the fields of the DTO.
		 */
		d.setId(p.getId());
		d.setDob(p.getBirthDate());
		d.setName(p.getName());
		d.setPatientId(p.getPatientId());
		return d;
	}

}
