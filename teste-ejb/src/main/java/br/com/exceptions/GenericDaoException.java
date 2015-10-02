package br.com.exceptions;

public class GenericDaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  public GenericDaoException() { 
		  super(); 
	  }
	  public GenericDaoException(String message) { 
		  super(message); 
	  }
	  public GenericDaoException(String message, Throwable cause) {
		  super(message, cause);
	  }
	  public GenericDaoException(Throwable cause) {
		  super(cause);
	  }
	
}
