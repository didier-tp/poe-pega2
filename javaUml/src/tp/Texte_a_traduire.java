package tp;

import java.util.*;

/**
 * 
 */
public class Texte_a_traduire {

    /**
     * Default constructor
     */
    public Texte_a_traduire() {
    }

    /**
     * 
     */
    private String texteEnAnglais = "hello";

    /**
     * 
     */
    private String texteTraduit = "?";

    /**
     * 
     */
    public void declencherTraduction() {
        Traducteur traducteur = null;
        //traducteur=new TraducteurFrancais();
        traducteur=new TraducteurEspagnol();
        this.texteTraduit = traducteur.traduire(this.texteEnAnglais);
        System.out.println("texteTraduit="+this.texteTraduit);
    }

}