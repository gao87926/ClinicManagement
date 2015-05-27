package edu.stevens.cs548.clinic.service.dto.provider;

import edu.stevens.cs548.clinic.domain.Provider;

public class ProviderDtoFactory {
	
	ObjectFactory factory;
	
	public ProviderDtoFactory() {
		factory = new ObjectFactory();
	}
	
	public ProviderDto createPatientDto (Provider p) {
		ProviderDto d = factory.createProviderDto();
		/*
		 * TODO: Initialize the fields of the DTO.
		 */
		d.setId(p.getId());
		d.setSpec(p.getSpec());
		d.setName(p.getName());
		d.setNpi(p.getProviderId());
		return d;
	}

}
