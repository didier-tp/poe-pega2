package livres;

import java.util.*;

public class Exemplaire {

    /**
     * Default constructor
     */
    public Exemplaire() {
    }

  
    private Integer numero;

    private String etatPhysique;

    private OeuvreLitteraire oeuvreLit;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getEtatPhysique() {
		return etatPhysique;
	}

	public void setEtatPhysique(String etatPhysique) {
		this.etatPhysique = etatPhysique;
	}

	public OeuvreLitteraire getOeuvreLit() {
		return oeuvreLit;
	}

	public void setOeuvreLit(OeuvreLitteraire oeuvreLit) {
		this.oeuvreLit = oeuvreLit;
	}
    
    

}