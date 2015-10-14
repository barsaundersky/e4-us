package br.com.contabo.ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.contabo.dao.DmstIrreParcCcfDAO;
import br.com.contabo.model.TB40Model;

/**
 * Session Bean implementation class TB40EJB
 */
@Stateless
public class TB40EJB {
	
	@EJB
	private DmstIrreParcCcfDAO dsmtIrreParcCcfDAO;
	
	
    /**
     * Default constructor.
     */
    public TB40EJB() {
        // TODO Auto-generated constructor stub
    }
    
    public List<TB40Model> findAll() {
    	return dsmtIrreParcCcfDAO.findAll();
    }
    
}
