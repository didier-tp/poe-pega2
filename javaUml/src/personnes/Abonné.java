package personnes;

import java.util.*;


public class Abonné extends Personne {

    /**
     * Default constructor
     */
    public Abonné() {
    }
    
    @Override
    public void sePresenter() {
    	System.out.print("je suis un abonné ");
    	super.sePresenter();
    }

  
    private Integer numero;


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}
    
    

}