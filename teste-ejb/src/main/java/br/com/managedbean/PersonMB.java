package br.com.managedbean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.facade.person.PersonFacade;
import br.com.model.Person;

/**
 * Session Bean implementation class PersonMB
 */
@ManagedBean(name = "person")
@RequestScoped
public class PersonMB {

	@EJB
    private PersonFacade personFacade;
 
    private static final String CREATE_PERSON = "createPerson";
    private static final String DELETE_PERSON = "deletePerson";
    private static final String UPDATE_PERSON = "updatePerson";
    private static final String LIST_ALL_PERSONS = "listAllPersons";
    private static final String STAY_IN_THE_SAME_PAGE = null;
 
    private Person person;
 
    public Person getPerson() {
 
        if(person == null){
            person = new Person();
        }
 
        return person;
    }
 
    public void setPerson(Person person) {
        this.person = person;
    }
 
    public List<Person> getAllPersons() {
        return personFacade.findAll();
    }
 
    public String updatePersonStart(){
        return UPDATE_PERSON;
    }
 
    public String updatePersonEnd(){
        try {
            personFacade.update(person);
        } catch (EJBException e) {
            sendErrorMessageToUser("Error. Check if the weight is above 0 or call the adm");
            return STAY_IN_THE_SAME_PAGE;
        }
 
        sendInfoMessageToUser("Operation Complete: Update");
        return LIST_ALL_PERSONS;
    }
 
    public String deletePersonStart(){
        return DELETE_PERSON;
    }
 
    public String deletePersonEnd(){
        try {
            personFacade.delete(person);
        } catch (EJBException e) {
            sendErrorMessageToUser("Error. Call the ADM");
            return STAY_IN_THE_SAME_PAGE;
        }           
 
        sendInfoMessageToUser("Operation Complete: Delete");
 
        return LIST_ALL_PERSONS;
    }
 
    public String createPersonStart(){
        return CREATE_PERSON;
    }
 
    public String createPersonEnd(){
        try {
            personFacade.save(person);
        } catch (EJBException e) {
            sendErrorMessageToUser("Error. Check if the weight is above 0 or call the adm");
 
            return STAY_IN_THE_SAME_PAGE;
        }       
 
        sendInfoMessageToUser("Operation Complete: Create");
 
        return LIST_ALL_PERSONS;
    }
 
    public String listAllPersons(){
        return LIST_ALL_PERSONS;
    }
 
    private void sendInfoMessageToUser(String message){
        FacesContext context = getContext();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));
    }
 
    private void sendErrorMessageToUser(String message){
        FacesContext context = getContext();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
    }
 
    private FacesContext getContext() {
        FacesContext context = FacesContext.getCurrentInstance();
        return context;
    }
    
}
