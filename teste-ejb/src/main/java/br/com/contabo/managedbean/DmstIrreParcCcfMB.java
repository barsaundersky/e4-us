package br.com.contabo.managedbean;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import br.com.contabo.ejb.TB40EJB;
import br.com.contabo.model.TB40Model;
import java.io.Serializable;
import java.util.List;

/**
 * Session Bean implementation class DmstIrreParcCcfMB implements Serializable
 */
@Named(value = "DmstIrreParc")
@SessionScoped
public class DmstIrreParcCcfMB implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private List<TB40Model> dmstIrreList;
	
	@EJB
	private TB40EJB tb40EJB;
	
    /**
     * Default constructor.
     */
    public DmstIrreParcCcfMB() {
        // TODO Auto-generated constructor stub
    }

	public List<TB40Model> getDmstIrreList() {
		return this.dmstIrreList;
	}

	public void setDmstIrreList(List<TB40Model> dmstIrreList) {
		this.dmstIrreList = dmstIrreList;
	}

	public TB40EJB getTb40EJB() {
		return tb40EJB;
	}

	public void setTb40EJB(TB40EJB tb40ejb) {
		tb40EJB = tb40ejb;
	}
    
    public void loadDmst() {
    	this.dmstIrreList = tb40EJB.findAll();
    }
    
}
