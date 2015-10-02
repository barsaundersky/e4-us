package br.com.facade.person;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.dao.PersonDAO;
import br.com.model.Person;

@Stateless
public class PersonFacadeImplementation implements PersonFacade{
	
	@EJB
	private PersonDAO personDAO;
	
	@Override
	public void save(Person person) {
		personDAO.save(person);
	}

	@Override
	public Person update(Person person) {
		return personDAO.update(person);
	}

	@Override
	public void delete(Person person) {
		personDAO.delete(person);
	}

	@Override
	public Person find(int entityID) {
		return personDAO.find(entityID);
	}

	@Override
	public List<Person> findAll() {
		return personDAO.findAll();
	}

}
