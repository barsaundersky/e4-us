package br.com.dao;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import br.com.model.Person;


@Stateless
public class PersonDAO extends GenericDAO<Person> {

	public PersonDAO() {
		super(Person.class);
	}
	
	public void delete(Person person) {
		super.delete(person.getId_Person(), Person.class);
	}
	
	public Person findPersonByEmail(String email) {
		Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("email", email);
        
        return super.findOneResult(Person.FIND_BY_EMAIL, parameters);
	}
}
