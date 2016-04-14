package classesMetier;

import java.io.Serializable;

/**
 *
 * @author gaellecastel
 */
public class User implements Serializable {
    private String login ;
    private String pwd ;

    public User(String login, String pwd) {
        this.login = login;
        this.pwd = pwd;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", pwd=" + pwd + '}';
    }
    
}
