package classesMetier;

import java.io.Serializable;

/**
 *
 * @author gaellecastel
 */

public class Lieu implements Serializable {
    private int idLieu ;
    private String nom ;
    private String adresseRue ;
    private String adresseVille ;
    private int codePostal ;
    
    /**
     * 
     * @param idLieu
     * @param nom
     * @param adresseRue
     * @param adresseVille
     * @param codePostal 
     */

    public Lieu(int idLieu, String nom, String adresseRue, String adresseVille, int codePostal) {
        this.idLieu = idLieu;
        this.nom = nom;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
    }
    
    /**
     * 
     * @param nom
     * @param adresseRue
     * @param adresseVille
     * @param codePostal 
     */
    
    public void modifier(String nom, String adresseRue, String adresseVille, int codePostal) {
        this.nom = nom;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
    }
    
    /**
     * 
     * @return 
     */

    public int getIdLieu() {
        return idLieu;
    }
    
    /**
     * 
     * @param idLieu 
     */

    public void setIdLieu(int idLieu) {
        this.idLieu = idLieu;
    }
    
    /**
     * 
     * @return 
     */

    public String getNom() {
        return nom;
    }
    
    /**
     * 
     * @param nom 
     */

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * 
     * @return 
     */

    public String getAdresseRue() {
        return adresseRue;
    }
    
    /**
     * 
     * @param adresseRue 
     */

    public void setAdresseRue(String adresseRue) {
        this.adresseRue = adresseRue;
    }
    
    /**
     * 
     * @return 
     */

    public String getAdresseVille() {
        return adresseVille;
    }
    
    /**
     * 
     * @param adresseVille 
     */

    public void setAdresseVille(String adresseVille) {
        this.adresseVille = adresseVille;
    }
    
    /**
     * 
     * @return 
     */

    public int getCodePostal() {
        return codePostal;
    }
    
    /**
     * 
     * @param codePostal 
     */

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
    
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "Lieu{" + "idLieu=" + idLieu + ", nom=" + nom + ", adresseRue=" + adresseRue + ", adresseVille=" + adresseVille + ", codePostal=" + codePostal + '}';
    }
    
}
