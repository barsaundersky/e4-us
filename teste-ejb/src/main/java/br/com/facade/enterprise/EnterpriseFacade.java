package br.com.facade.enterprise;

import java.util.List;

import javax.ejb.Local;

import br.com.model.Enterprise;

@Local
public interface EnterpriseFacade {
	
	public abstract void save(Enterprise enterprise);
	 
	public abstract Enterprise update(Enterprise enterprise);
	 
	public abstract void delete(Enterprise enterprise);
	 
	public abstract Enterprise find(int entityID);
	 
	public abstract List<Enterprise> findAll();
	
	
	
}
