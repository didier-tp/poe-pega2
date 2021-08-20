package personnes;

import java.util.*;


public class  Personne {

    /**
     * Default constructor
     */
    public Personne() {
    }

 
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private static String planete;
    
    private Adresse adressePrincipale;

   
    public void sePresenter() {
        System.out.println("je m'appelle " + prenom + " " +nom);
    }


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public static String getPlanete() {
		return planete;
	}


	public static void setPlanete(String planete) {
		Personne.planete = planete;
	}


	public Adresse getAdressePrincipale() {
		return adressePrincipale;
	}


	public void setAdressePrincipale(Adresse adressePrincipale) {
		this.adressePrincipale = adressePrincipale;
	}


    

}