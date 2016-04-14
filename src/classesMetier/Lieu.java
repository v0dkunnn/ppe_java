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

    public Lieu(int idLieu, String nom, String adresseRue, String adresseVille, int codePostal) {
        this.idLieu = idLieu;
        this.nom = nom;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
    }
    
    public void modifier(String nom, String adresseRue, String adresseVille, int codePostal) {
        this.nom = nom;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
    }

    public int getIdLieu() {
        return idLieu;
    }

    public void setIdLieu(int idLieu) {
        this.idLieu = idLieu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresseRue() {
        return adresseRue;
    }

    public void setAdresseRue(String adresseRue) {
        this.adresseRue = adresseRue;
    }

    public String getAdresseVille() {
        return adresseVille;
    }

    public void setAdresseVille(String adresseVille) {
        this.adresseVille = adresseVille;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Lieu{" + "idLieu=" + idLieu + ", nom=" + nom + ", adresseRue=" + adresseRue + ", adresseVille=" + adresseVille + ", codePostal=" + codePostal + '}';
    }
    
    
}
