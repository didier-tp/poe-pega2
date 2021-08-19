package personnes;

import java.util.*;


public class Employe extends Personne {

    /**
     * Default constructor
     */
    public Employe() {
    }

    
    private String username;
    private String password;
    
    //on reprogramme une operation deja codee dans un classe h�rit�e 
    //c'est possible mais pas obligatoire
    //on dit que l'on red�fini l'op�ration avec un code diff�rent ou enrichi
    public void sePresenter() {
        System.out.print("je suis un employe et ");
        //super est mot clef du langage java (superclasse : classe dont on h�rite directement)
        super.sePresenter();
    }
    
    public Boolean verifPassword(String pwd) {
    	if(pwd.equals(this.password))
    		return true;
    	else
    		return false;
    }
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    

}