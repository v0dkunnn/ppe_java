package classesMetier;

import java.io.Serializable;

/**
 *
 * @author gaellecastel
 */

public class User implements Serializable {
    private String login ;
    private String pwd ;
    
    /**
     * 
     * @param login
     * @param pwd 
     */

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }
    
    /**
     * 
     * @return 
     */

    public String getLogin() {
        return login;
    }
    
    /**
     * 
     * @param login 
     */

    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * 
     * @return 
     */

    public String getPwd() {
        return pwd;
    }
    
    /**
     * 
     * @param pwd 
     */

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", pwd=" + pwd + '}';
    }
    
}
