
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
    
    /**
     * 
     * @param nomIntermittent
     * @param prenomIntermittent
     * @param adresseRue
     * @param adresseVille
     * @param codePostal
     * @param mailIntermittent
     * @param telIntermittent
     * @param dateNaissance
     * @param villeNaissance
     * @param nationalite
     * @param numeroCongeSpectacle
     * @param numeroInsee
     * @param remarques
     * @param leUser 
     */

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
    
    /**
     * 
     * @param nomIntermittent
     * @param prenomIntermittent
     * @param adresseRue
     * @param adresseVille
     * @param codePostal
     * @param mailIntermittent
     * @param telIntermittent
     * @param dateNaissance
     * @param villeNaissance
     * @param nationalite
     * @param numeroCongeSpectacle
     * @param numeroInsee
     * @param remarques 
     */
    
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
    
    /**
     * 
     * @return 
     */

    public int getIdIntermittent() {
        return idIntermittent;
    }
    
    /**
     * 
     * @param idIntermittent 
     */

    public void setIdIntermittent(int idIntermittent) {
        this.idIntermittent = idIntermittent;
    }
    
    /**
     * 
     * @return 
     */

    public String getNomIntermittent() {
        return nomIntermittent;
    }
    
    /**
     * 
     * @param nomIntermittent 
     */

    public void setNomIntermittent(String nomIntermittent) {
        this.nomIntermittent = nomIntermittent;
    }
    
    /**
     * 
     * @return 
     */

    public String getPrenomIntermittent() {
        return prenomIntermittent;
    }
    
    /**
     * 
     * @param prenomIntermittent 
     */

    public void setPrenomIntermittent(String prenomIntermittent) {
        this.prenomIntermittent = prenomIntermittent;
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

    public String getMailIntermittent() {
        return mailIntermittent;
    }
    
    /**
     * 
     * @param mailIntermittent 
     */

    public void setMailIntermittent(String mailIntermittent) {
        this.mailIntermittent = mailIntermittent;
    }
    
    /**
     * 
     * @return 
     */

    public String getTelIntermittent() {
        return telIntermittent;
    }
    
    /**
     * 
     * @param telIntermittent 
     */

    public void setTelIntermittent(String telIntermittent) {
        this.telIntermittent = telIntermittent;
    }
    
    /**
     * 
     * @return 
     */

    public String getDateNaissance() {
        return dateNaissance;
    }
    
    /**
     * 
     * @param dateNaissance 
     */

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    /**
     * 
     * @return 
     */

    public String getVilleNaissance() {
        return villeNaissance;
    }
    
    /**
     * 
     * @param villeNaissance 
     */

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }
    
    /**
     * 
     * @return 
     */

    public String getNationalite() {
        return nationalite;
    }
    
    /**
     * 
     * @param nationalite 
     */

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
    
    /**
     * 
     * @return 
     */

    public String getNumeroCongeSpectacle() {
        return numeroCongeSpectacle;
    }
    
    /**
     * 
     * @param numeroCongeSpectacle 
     */

    public void setNumeroCongeSpectacle(String numeroCongeSpectacle) {
        this.numeroCongeSpectacle = numeroCongeSpectacle;
    }
    
    /**
     * 
     * @return 
     */

    public String getNumeroInsee() {
        return numeroInsee;
    }
    
    /**
     * 
     * @param numeroInsee 
     */

    public void setNumeroInsee(String numeroInsee) {
        this.numeroInsee = numeroInsee;
    }
    
    /**
     * 
     * @return 
     */

    public String getRemarques() {
        return remarques;
    }
    
    /**
     * 
     * @param remarques 
     */

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }
    
    /**
     * 
     * @return 
     */

    public User getLeUser() {
        return leUser;
    }
    
    /**
     * 
     * @param leUser 
     */

    public void setLeUser(User leUser) {
        this.leUser = leUser;
    }
    
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "Intermittent{" + "idIntermittent=" + idIntermittent + ", nomIntermittent=" + nomIntermittent + ", prenomIntermittent=" + prenomIntermittent + ", adresseRue=" + adresseRue + ", adresseVille=" + adresseVille + ", codePostal=" + codePostal + ", mailIntermittent=" + mailIntermittent + ", telIntermittent=" + telIntermittent + ", dateNaissance=" + dateNaissance + ", villeNaissance=" + villeNaissance + ", nationalite=" + nationalite + ", numeroCongeSpectacle=" + numeroCongeSpectacle + ", numeroInsee=" + numeroInsee + ", remarques=" + remarques + ", leUser=" + leUser + '}';
    }

}

