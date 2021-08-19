package personnes;

import java.util.*;

public class Adresse {

    /**
     * Default constructor
     */
    public Adresse() {
    }
    
    

    public Adresse(String numEtRue, String codePostal, String ville) {
		super();
		this.numEtRue = numEtRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}



	private String numEtRue;
    private String codePostal;
    private String ville;
    
    
	public String getNumEtRue() {
		return numEtRue;
	}
	public void setNumEtRue(String numEtRue) {
		this.numEtRue = numEtRue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
    
    

}