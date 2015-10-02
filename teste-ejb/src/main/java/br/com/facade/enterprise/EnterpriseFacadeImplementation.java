package br.com.facade.enterprise;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.dao.EnterpriseDAO;
import br.com.model.Enterprise;

@Stateless
public class EnterpriseFacadeImplementation implements EnterpriseFacade {
	
	@EJB
	private EnterpriseDAO enterpriseDAO;
	
	@Override
	public void save(Enterprise enterprise) {
		enterpriseDAO.save(enterprise);
	}

	@Override
	public Enterprise update(Enterprise enterprise) {
		return enterpriseDAO.update(enterprise);
	}

	@Override
	public void delete(Enterprise enterprise) {
		enterpriseDAO.delete(enterprise);
	}

	@Override
	public Enterprise find(int entityID) {
		return enterpriseDAO.find(entityID);
	}

	@Override
	public List<Enterprise> findAll() {
		return enterpriseDAO.findAll();
	}
	
}
