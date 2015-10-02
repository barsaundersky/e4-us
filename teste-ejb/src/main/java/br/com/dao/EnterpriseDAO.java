package br.com.dao;

import javax.ejb.Stateless;
import br.com.model.Enterprise;


@Stateless
public class EnterpriseDAO extends GenericDAO<Enterprise> {

	public EnterpriseDAO() {
		super(Enterprise.class);
	}
	
	public void delete(Enterprise enterprise) {
		super.delete(enterprise.getIdEnterprise(), Enterprise.class);
	}
		
}
