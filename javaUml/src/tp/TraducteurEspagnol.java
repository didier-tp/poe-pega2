package tp;

import java.util.*;

/**
 * 
 */
public class TraducteurEspagnol implements Traducteur {

    /**
     * Default constructor
     */
    public TraducteurEspagnol() {
    	this.mapTradEs.put("hello", "buenos dias");
    	this.mapTradEs.put("thank you", "gracias");
    }

    /**
     * 
     */
    private Map<String,String> mapTradEs = new HashMap<>();

    /**
     * @param texte 
     * @return
     */
    public String traduire(String texte) {
        return this.mapTradEs.get(texte);
    }

    /**
     * @param texte 
     * @return
     */
    public String traduireEnMaj(String texte) {
    	return this.mapTradEs.get(texte).toUpperCase();
    }

}