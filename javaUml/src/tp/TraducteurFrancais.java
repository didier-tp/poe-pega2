package tp;

import java.util.*;

/**
 * 
 */
public class TraducteurFrancais implements Traducteur {

    /**
     * Default constructor
     */
    public TraducteurFrancais() {
    	this.mapTradFr.put("hello", "bonjour");
    	this.mapTradFr.put("thank you", "merci");
    }

    /**
     * 
     */
    private Map<String,String> mapTradFr = new HashMap<>();

    /**
     * @param texte 
     * @return
     */
    public String traduire(String texte) {
    	 return this.mapTradFr.get(texte);
    }

    /**
     * @param texte 
     * @return
     */
    public String traduireEnMaj(String texte) {
    	return this.mapTradFr.get(texte).toUpperCase();
    }

}