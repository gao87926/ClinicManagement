package edu.stevens.cs548.clinic.domain;

import java.util.List;

public interface IProviderDAO {
	public static class ProviderExn extends Exception {
		private static final long serialVersionUID = 1L;

		public ProviderExn(String msg) {
			super(msg);
		}
	}
	public Provider getProviderByProviderId(long npi) throws ProviderExn;

	public Provider getProviderByDbId(long id) throws ProviderExn;

	public List<Provider> getProviderByName(String name);

	public long addProvider(Provider provider) throws ProviderExn;

	public void deleteProvider(Provider provider) throws ProviderExn;
}
