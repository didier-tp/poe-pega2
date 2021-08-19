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