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
public class PersonneStructure {
     private int idPersonne;
    private int numeroLicence ;
    private String nomPersonne ;
    private String qualitePersonne;
    private String telPersonne ;

    public PersonneStructure(int idPersonne, int numeroLicence, String nomPersonne, String qualitePersonne, String telPersonne) {
        this.idPersonne = idPersonne;
        this.numeroLicence = numeroLicence;
        this.nomPersonne = nomPersonne;
        this.qualitePersonne = qualitePersonne;
        this.telPersonne = telPersonne;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public int getNumeroLicence() {
        return numeroLicence;
    }

    public void setNumeroLicence(int numeroLicence) {
        this.numeroLicence = numeroLicence;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getQualitePersonne() {
        return qualitePersonne;
    }

    public void setQualitePersonne(String qualitePersonne) {
        this.qualitePersonne = qualitePersonne;
    }

    public String getTelPersonne() {
        return telPersonne;
    }

    public void setTelPersonne(String telPersonne) {
        this.telPersonne = telPersonne;
    }


    
}

