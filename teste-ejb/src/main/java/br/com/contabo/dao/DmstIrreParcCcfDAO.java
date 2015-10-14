package br.com.contabo.dao;

import javax.ejb.Stateless;

import br.com.contabo.model.TB40Model;

@Stateless
public class DmstIrreParcCcfDAO extends GenericDAO<TB40Model>{
	
	
	public DmstIrreParcCcfDAO() {
		super(TB40Model.class);
	}
	
}
