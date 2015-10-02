package br.com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the enterprise database table.
 * 
 */
@Entity
@Table(name = "Enterprise")
@NamedQuery(name="Enterprise.findAll", query="SELECT e FROM Enterprise e")
public class Enterprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEnterprise;
	
	@Column(unique = true)
	private String cnpj;

	private String nameEnterprise;

	public Enterprise() {
	}

	public int getIdEnterprise() {
		return this.idEnterprise;
	}

	public void setIdEnterprise(int idEnterprise) {
		this.idEnterprise = idEnterprise;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNameEnterprise() {
		return this.nameEnterprise;
	}

	public void setNameEnterprise(String nameEnterprise) {
		this.nameEnterprise = nameEnterprise;
	}
	
	public int hashCode() {
		return getIdEnterprise();
	}
	
	public boolean equals(Object o) {
		if(o instanceof Enterprise) {
			Enterprise enterprise = (Enterprise) o;
			return enterprise.cnpj.equals(getCnpj());
		}
		return false;
	}
	
}