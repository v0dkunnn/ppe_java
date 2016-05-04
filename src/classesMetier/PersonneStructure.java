
package classesMetier;

import java.io.Serializable;

/**
 *
 * @author babur
 */

public class PersonneStructure implements Serializable {
     private int idPersonne;
    private int numeroLicence ;
    private String nomPersonne ;
    private String prenomPersonne;
    private String qualitePersonne;
    private String telPersonne ;
    
    /**
     * 
     * @param idPersonne
     * @param numeroLicence
     * @param nomPersonne
     * @param prenomPersonne
     * @param qualitePersonne
     * @param telPersonne 
     */

    public PersonneStructure(int idPersonne, int numeroLicence, String nomPersonne, String prenomPersonne, String qualitePersonne, String telPersonne) {
        this.idPersonne = idPersonne;
        this.numeroLicence = numeroLicence;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
        this.qualitePersonne = qualitePersonne;
        this.telPersonne = telPersonne;
    }
    
    /**
     * 
     * @return 
     */

    public int getIdPersonne() {
        return idPersonne;
    }
    
    /**
     * 
     * @param idPersonne 
     */

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }
    
    /**
     * 
     * @return 
     */

    public int getNumeroLicence() {
        return numeroLicence;
    }
    
    /**
     * 
     * @param numeroLicence 
     */

    public void setNumeroLicence(int numeroLicence) {
        this.numeroLicence = numeroLicence;
    }
    
    /**
     * 
     * @return 
     */

    public String getNomPersonne() {
        return nomPersonne;
    }
    
    /**
     * 
     * @param nomPersonne 
     */

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }
    
    /**
     * 
     * @return 
     */
    
    public String getPrenomPersonne() {
        return prenomPersonne;
    }
    
    /**
     * 
     * @param prenomPersonne 
     */
    
    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }
    
    /**
     * 
     * @return 
     */

    public String getQualitePersonne() {
        return qualitePersonne;
    }
    
    /**
     * 
     * @param qualitePersonne 
     */

    public void setQualitePersonne(String qualitePersonne) {
        this.qualitePersonne = qualitePersonne;
    }
    
    /**
     * 
     * @return 
     */

    public String getTelPersonne() {
        return telPersonne;
    }
    
    /**
     * 
     * @param telPersonne 
     */

    public void setTelPersonne(String telPersonne) {
        this.telPersonne = telPersonne;
    }
    
}

