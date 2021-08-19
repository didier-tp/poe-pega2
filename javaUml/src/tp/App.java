package tp;

import java.util.ArrayList;
import java.util.List;

import livres.Exemplaire;
import livres.OeuvreLitteraire;
import personnes.Abonné;
import personnes.Adresse;
import personnes.Employe;
import personnes.Personne;

public class App {

	public static void main(String[] args) {
		
		OeuvreLitteraire o1 = new OeuvreLitteraire("1" , "Les Miserables" , "Victor Hugo" , "Editeur 1");
		
		Exemplaire ex1_o1 = new Exemplaire();
		ex1_o1.setNumero(1); ex1_o1.setEtatPhysique("BonEtat");
		ex1_o1.setOeuvreLit(o1); o1.getExemplaires().add(ex1_o1); //lien bi-directionnel
		
		Exemplaire ex2_o1 = new Exemplaire();
		ex2_o1.setNumero(2); ex2_o1.setEtatPhysique("Abime");
		ex2_o1.setOeuvreLit(o1);o1.getExemplaires().add(ex2_o1); //lien dans les 2 sens
		
		System.out.println("tous les exemplaires de l'oeuvre o1:");
		for(Exemplaire ex : o1.getExemplaires()) {
			System.out.println(ex.getNumero() + " " + ex.getEtatPhysique());
		}
		
		System.out.println("Titre de l'exemplaire 1:"+ ex1_o1.getOeuvreLit().getTitre());
		
		
		Personne p1 = new Personne();
		p1.setPrenom("alex");
        p1.setNom("Therieur");
        System.out.println(p1.getPrenom());
        p1.sePresenter();
        
        Adresse adr1 = new Adresse("12 rue elle" , "75001" , "Paris");
        p1.setAdressePrincipale(adr1);
        
        String villeDeP1 = p1.getAdressePrincipale().getVille();
        System.out.println("p1 habite " + villeDeP1);
        
        Employe e1 = new Employe();
        e1.setPrenom("jean");
        e1.setNom("Bon");
        e1.sePresenter(); //on appelle le code hérité ou bien redéfini
        e1.setUsername("jb");
        e1.setPassword("007");
        if(e1.verifPassword("005"))
        	System.out.println("e1 a 005 comme mot de passe");
        else 
        	System.out.println("e1 n'a pas 005 comme mot de passe");
        
        Abonné a1 = new Abonné();
        a1.setPrenom("axelle");
        a1.setNom("Aire");
        a1.setNumero(1);
        a1.sePresenter();
        
        Personne refP=null; //refP peut référencer n'importe quel type
                            //de personne (ordinaire ou employe ou ...)
        refP = e1;
        refP.sePresenter();//version Employe appelée (polymorphisme)
        refP = a1;
        refP.sePresenter();//version Abonné appelée (polymorphisme)
        
        List<Personne> listePersonnes = new ArrayList<Personne>(); 
        listePersonnes.add(p1);
        listePersonnes.add(e1);
        listePersonnes.add(a1);
        System.out.println("------");
        for(Personne refPers : listePersonnes) {
        	refPers.sePresenter();//version Personne ou Employe ou Abonné appelée 
        	                      //(polymorphisme)
        }
        
	}

}
