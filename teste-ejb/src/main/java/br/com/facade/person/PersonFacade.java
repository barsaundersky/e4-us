package br.com.facade.person;

import java.util.List;
import javax.ejb.Local;
import br.com.model.Person;

@Local
public interface PersonFacade {
	
	 public void save(Person person);
	 
	 public Person update(Person person);
	 
	 public void delete(Person person);
	 
	 public Person find(int entityID);
	 
	 public List<Person> findAll();
	
}
