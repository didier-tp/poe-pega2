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
        Traducteur traducteur = null; //r�f�rence sur une chose quelconque 
                                       //qui impl�mente l'interface Traducteur
        //traducteur=new TraducteurFrancais();
        traducteur=new TraducteurEspagnol();
        this.texteTraduit = traducteur.traduireEnMaj(this.texteEnAnglais);
        System.out.println("texteTraduit="+this.texteTraduit);
    }

}