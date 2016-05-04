
package classesMetier;
/**
 *
 * @author babur
 */

public class Structure {
    
   private int idStructure;
    private int codeNafOuApe ;
    private int numeroSiret ;
    private String raisonSociale ;
    private String adresseRue;
    private String adresseVille;   
    private int CodePostal ;
    private String mail;
    private int telephone ;
    private PersonneStructure leResponsable ;
    private PersonneStructure leContact;
    
    /**
     * 
     * @param idStructure
     * @param codeNafOuApe
     * @param numeroSiret
     * @param raisonSociale
     * @param adresseRue
     * @param adresseVille
     * @param CodePostal
     * @param mail
     * @param telephone
     * @param leResponsable
     * @param leContact 
     */

    public Structure(int idStructure, int codeNafOuApe, int numeroSiret, String raisonSociale, String adresseRue, String adresseVille, int CodePostal, String mail, int telephone, PersonneStructure leResponsable, PersonneStructure leContact) {
        this.idStructure = idStructure;
        this.codeNafOuApe = codeNafOuApe;
        this.numeroSiret = numeroSiret;
        this.raisonSociale = raisonSociale;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.CodePostal = CodePostal;
        this.mail = mail;
        this.telephone = telephone;
        this.leResponsable = leResponsable;
        this.leContact = leContact;
    }
    
    /**
     * 
     * @param codeNafOuApe
     * @param numeroSiret
     * @param raisonSociale
     * @param adresseRue
     * @param adresseVille
     * @param CodePostal
     * @param mail 
     */

    
     public void modifier(int codeNafOuApe, int numeroSiret, String raisonSociale, String adresseRue, String adresseVille, int CodePostal, String mail) {
       this.codeNafOuApe = codeNafOuApe;
       this.numeroSiret = numeroSiret;
       this.raisonSociale = raisonSociale;
       this.adresseRue = adresseRue;
       this.adresseVille = adresseVille;
       this.CodePostal = CodePostal;
       this.mail = mail;
      
    }
     
    /**
     * 
     * @return 
     */

    public int getIdStructure() {
        return idStructure;
    }
    
    /**
     * 
     * @param idStructure 
     */

    public void setIdStructure(int idStructure) {
        this.idStructure = idStructure;
    }
    
    /**
     * 
     * @return 
     */

    public int getCodeNafOuApe() {
        return codeNafOuApe;
    }
    
    /**
     * 
     * @param codeNafOuApe 
     */

    public void setCodeNafOuApe(int codeNafOuApe) {
        this.codeNafOuApe = codeNafOuApe;
    }
    
    /**
     * 
     * @return 
     */

    public int getNumeroSiret() {
        return numeroSiret;
    }
    
    /**
     * 
     * @param numeroSiret 
     */

    public void setNumeroSiret(int numeroSiret) {
        this.numeroSiret = numeroSiret;
    }
    
    /**
     * 
     * @return 
     */

    public String getRaisonSociale() {
        return raisonSociale;
    }
    
    /**
     * 
     * @param raisonSociale 
     */

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
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
        return CodePostal;
    }
    
    /**
     * 
     * @param CodePostal 
     */

    public void setCodePostal(int CodePostal) {
        this.CodePostal = CodePostal;
    }
    
    /**
     * 
     * @return 
     */

    public String getMail() {
        return mail;
    }
    
    /**
     * 
     * @param mail 
     */

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    /**
     * 
     * @return 
     */

    public int getTelephone() {
        return telephone;
    }
    
    /**
     * 
     * @param telephone 
     */

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    /**
     * 
     * @return 
     */

    public PersonneStructure getLeResponsable() {
        return leResponsable;
    }
    
    /**
     * 
     * @param leResponsable 
     */

    public void setLeResponsable(PersonneStructure leResponsable) {
        this.leResponsable = leResponsable;
    }
    
    /**
     * 
     * @return 
     */

    public PersonneStructure getLeContact() {
        return leContact;
    }
    
    /**
     * 
     * @param leContact 
     */

    public void setLeContact(PersonneStructure leContact) {
        this.leContact = leContact;
    }
    
}