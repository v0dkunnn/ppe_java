/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    
     public void modifier(int codeNafOuApe, int numeroSiret, String raisonSociale, String adresseRue, String adresseVille, int CodePostal, String mail) {
       this.codeNafOuApe = codeNafOuApe;
        this.numeroSiret = numeroSiret;
        this.raisonSociale = raisonSociale;
        this.adresseRue = adresseRue;
        this.adresseVille = adresseVille;
        this.CodePostal = CodePostal;
        this.mail = mail;
      
    }

    public int getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(int idStructure) {
        this.idStructure = idStructure;
    }

    public int getCodeNafOuApe() {
        return codeNafOuApe;
    }

    public void setCodeNafOuApe(int codeNafOuApe) {
        this.codeNafOuApe = codeNafOuApe;
    }

    public int getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(int numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
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
        return CodePostal;
    }

    public void setCodePostal(int CodePostal) {
        this.CodePostal = CodePostal;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public PersonneStructure getLeResponsable() {
        return leResponsable;
    }

    public void setLeResponsable(PersonneStructure leResponsable) {
        this.leResponsable = leResponsable;
    }

    public PersonneStructure getLeContact() {
        return leContact;
    }

    public void setLeContact(PersonneStructure leContact) {
        this.leContact = leContact;
    }



     
   

    
    
    
}