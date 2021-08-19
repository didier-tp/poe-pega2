package livres;

import java.util.*;


public class OeuvreLitteraire {

    /**
     * Default constructor
     */
    public OeuvreLitteraire() {
    }

    
  
    public OeuvreLitteraire(String numIsbn, String titre, String auteur, String editeur) {
		super();
		this.numIsbn = numIsbn;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
	}



	private String numIsbn;

    private String titre;
   
    private String auteur;

    private String editeur;

    //private List<Exemplaire> exemplaires;
    private Set<Exemplaire> exemplaires = new HashSet<>();

	public String getNumIsbn() {
		return numIsbn;
	}

	public void setNumIsbn(String numIsbn) {
		this.numIsbn = numIsbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Set<Exemplaire> getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Set<Exemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}
    
    

}