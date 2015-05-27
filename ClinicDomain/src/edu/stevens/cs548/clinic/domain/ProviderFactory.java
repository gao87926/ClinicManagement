package edu.stevens.cs548.clinic.domain;

public class ProviderFactory implements IProviderFactory {

	@Override
	public Provider createProvider(long npi, String name, String spec) {
	Provider p = new Provider();
	p.setProviderId(npi);
	p.setName(name);
	p.setSpec(spec);
		return p;
	}

}

