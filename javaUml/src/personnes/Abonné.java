package personnes;

import java.util.*;


public class Abonn� extends Personne {

    /**
     * Default constructor
     */
    public Abonn�() {
    }
    
    @Override
    public void sePresenter() {
    	System.out.print("je suis un abonn� ");
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