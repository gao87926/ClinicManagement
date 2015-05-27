package edu.stevens.cs548.clinic.domain;

import java.util.List;
import javax.persistence.*;

import java.util.logging.Logger;

public class ProviderDAO implements IProviderDAO {

	private EntityManager em;
	private TreatmentDAO treatmentDAO;
	private Logger logger = Logger
			.getLogger("edu.stevens.cs548.clinic.domain.IPatientDAO");

	
	@Override
	public Provider getProviderByDbId(long id) throws ProviderExn {
		Provider p = em.find(Provider.class, id);
		if (p == null) {
			throw new ProviderExn("Provider not found primary key = " + id);
		} else {
			p.setTreatmentDAO(this.treatmentDAO);
			return p;
		}
	}
	
	@Override
	public Provider getProviderByProviderId(long npi) throws ProviderExn {
		TypedQuery<Provider> query = 
				em.createNamedQuery("SearchProviderByProviderID", Provider.class)
				.setParameter("npi", npi);
		List<Provider> providers = query.getResultList();
		if (providers.size() >1){
			logger.info("Duplicate provider records: provider id = " + npi);
			throw new ProviderExn("Duplicate provider records: provider id = " + npi  );
			
		}else if(providers.size()<1){
			throw new ProviderExn("Provider not found: provider id = " + npi  );
		}else{
			Provider p = providers.get(0);
			p.setTreatmentDAO(this.treatmentDAO);
			return p;
		}
		
	}



	@Override
	public List<Provider> getProviderByName(String name) {
		TypedQuery<Provider> query = 
				em.createNamedQuery("SearchProviderByName", Provider.class)
				.setParameter("name", name);			
		List<Provider> providers =query.getResultList();
		for(Provider p :providers){
			p.setTreatmentDAO(this.treatmentDAO);
		}
		return providers;
	}

	@Override
	public long addProvider(Provider provider) throws ProviderExn {
		long npi = provider.getProviderId();
		TypedQuery<Provider> query = 
				em.createNamedQuery("SearchProviderByProviderID", Provider.class)
				.setParameter("npi", npi);
		List<Provider> providers = query.getResultList();
		if(providers.size()<1){
			em.persist(provider);
			provider.setTreatmentDAO(this.treatmentDAO);
			return provider.getId();
		}else{
			Provider provider2 = providers.get(0);
			throw new ProviderExn("Insertion: Provider with provider id( "+
			npi +") already exists. \n** Name: " + provider2.getName());
		}
	}

	@Override
	public void deleteProvider(Provider provider) throws ProviderExn {
		em.remove(provider);
	}
	public ProviderDAO(EntityManager em) {
		this.em = em;
		this.treatmentDAO = new TreatmentDAO(em);
	}

}
