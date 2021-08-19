package tp;

import java.util.ArrayList;
import java.util.List;

import personnes.Abonné;
import personnes.Employe;
import personnes.Personne;

public class App {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		p1.setPrenom("alex");
        p1.setNom("Therieur");
        System.out.println(p1.getPrenom());
        p1.sePresenter();
        
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
