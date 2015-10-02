package br.com.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table(name = "person")
@NamedQueries({
	@NamedQuery(name="person.findPersonByEmail", query="select p from Person p where p.email = :email")
})
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String FIND_BY_EMAIL = "person.findPersonByEmail";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id_Person;
	
	@Column(name="CPF", unique = true)
	private String cpf;

	@Column(name="person_age")
	private int personAge;

	@Column(name="person_name")
	private String personName;
	
	@Column(name = "role")
	private Integer role;
	
	@Column(name = "email", unique = true)
	private String email;
	
	public Person() {
	}

	public Integer getId_Person() {
		return this.id_Person;
	}

	public void setId_Person(Integer id_Person) {
		this.id_Person = id_Person;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getPersonAge() {
		return this.personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int hashCode() {
		return getId_Person();
	}
	
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person person = (Person) o;
			return person.getEmail().equals(getEmail());
		}
		return false;
	}
	
}