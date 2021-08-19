package tp;

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
	}

}
