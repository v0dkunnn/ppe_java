
package classesMetier;

import java.io.Serializable;

/**
 *
 * @author gaellecastel
 */
public class Intermittent implements Serializable {
    private int idIntermittent ;
    private String nomIntermittent ;
    private String prenomIntermittent ;    
    private String adresseRue ;
    private String adresseVille ;
    private int codePostal ;
    private String mailIntermittent ;
    private String telIntermittent ;
    private String dateNaissance ;
    private String villeNaissance ;
    private String nationalite ;
    private String numeroCongeSpectacle ;
    private String numeroInsee ;
    private String remarques ;
    private User leUser ;
    
    private static int donneNumeroIntermittent = 0;

    public Intermittent(String nomIntermittent, String prenomIntermittent, String adresseRue, String adresseVille, int codePostal, String mailIntermittent, String telIntermittent, String dateNaissance, String villeNaissance, String nationalite, String numeroCongeSpectacle, String numeroInsee, String remarques, User leUser) {
        Intermittent.donneNumeroIntermittent++;
        this.idIntermittent = Intermittent.donneNumeroIntermittent;
        this.nomIntermittent = nomIntermittent;
        this.prenomIntermittent = prenomIntermittent;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
        this.mailIntermittent = mailIntermittent;
        this.telIntermittent = telIntermittent;
        this.dateNaissance = dateNaissance;
        this.villeNaissance = villeNaissance;
        this.nationalite = nationalite;
        this.numeroCongeSpectacle = numeroCongeSpectacle;
        this.numeroInsee = numeroInsee;
        this.remarques = remarques;
        this.leUser = leUser;
    }
    
    public void modifier(String nomIntermittent, String prenomIntermittent, String adresseRue, String adresseVille, int codePostal, String mailIntermittent, String telIntermittent, String dateNaissance, String villeNaissance, String nationalite, String numeroCongeSpectacle, String numeroInsee, String remarques) {
        //modification des attributs de cet intermittent
        this.nomIntermittent = nomIntermittent;
        this.prenomIntermittent = prenomIntermittent;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.codePostal = codePostal;
        this.mailIntermittent = mailIntermittent;
        this.telIntermittent = telIntermittent;
        this.dateNaissance = dateNaissance;
        this.villeNaissance = villeNaissance;
        this.nationalite = nationalite;
        this.numeroCongeSpectacle = numeroCongeSpectacle;
        this.numeroInsee = numeroInsee;
        this.remarques = remarques;
    }

    public int getIdIntermittent() {
        return idIntermittent;
    }

    public void setIdIntermittent(int idIntermittent) {
        this.idIntermittent = idIntermittent;
    }

    public String getNomIntermittent() {
        return nomIntermittent;
    }

    public void setNomIntermittent(String nomIntermittent) {
        this.nomIntermittent = nomIntermittent;
    }

    public String getPrenomIntermittent() {
        return prenomIntermittent;
    }

    public void setPrenomIntermittent(String prenomIntermittent) {
        this.prenomIntermittent = prenomIntermittent;
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

    public String getMailIntermittent() {
        return mailIntermittent;
    }

    public void setMailIntermittent(String mailIntermittent) {
        this.mailIntermittent = mailIntermittent;
    }

    public String getTelIntermittent() {
        return telIntermittent;
    }

    public void setTelIntermittent(String telIntermittent) {
        this.telIntermittent = telIntermittent;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getNumeroCongeSpectacle() {
        return numeroCongeSpectacle;
    }

    public void setNumeroCongeSpectacle(String numeroCongeSpectacle) {
        this.numeroCongeSpectacle = numeroCongeSpectacle;
    }

    public String getNumeroInsee() {
        return numeroInsee;
    }

    public void setNumeroInsee(String numeroInsee) {
        this.numeroInsee = numeroInsee;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public User getLeUser() {
        return leUser;
    }

    public void setLeUser(User leUser) {
        this.leUser = leUser;
    }

    @Override
    public String toString() {
        return "Intermittent{" + "idIntermittent=" + idIntermittent + ", nomIntermittent=" + nomIntermittent + ", prenomIntermittent=" + prenomIntermittent + ", adresseRue=" + adresseRue + ", adresseVille=" + adresseVille + ", codePostal=" + codePostal + ", mailIntermittent=" + mailIntermittent + ", telIntermittent=" + telIntermittent + ", dateNaissance=" + dateNaissance + ", villeNaissance=" + villeNaissance + ", nationalite=" + nationalite + ", numeroCongeSpectacle=" + numeroCongeSpectacle + ", numeroInsee=" + numeroInsee + ", remarques=" + remarques + ", leUser=" + leUser + '}';
    }

    
}

