
package classesMetier;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gaellecastel
 */

public class ContratCession implements Serializable {
    private String numeroContratCession ;
    private double montantGlobalContrat ;
    private Spectacle leSpectacleDuContratDeCession ;
    private ArrayList <Representation> lesRepresentations ;
    private boolean edition;
    
    /**
     * 
     * @param numeroContratCession
     * @param montantGlobalCession
     * @param leSpectacleDuContratDeCession 
     */

    public ContratCession(String numeroContratCession, double montantGlobalCession, Spectacle leSpectacleDuContratDeCession) {
        this.numeroContratCession = numeroContratCession;
        this.montantGlobalContrat = montantGlobalCession;
        this.leSpectacleDuContratDeCession = leSpectacleDuContratDeCession;
        lesRepresentations = new ArrayList <Representation>() ;
        this.edition = false; //l'indicateur d'édition est mis à FAUX
    }
    
    /**
     * 
     * @param numeroContratCession
     * @param montantGlobalCession
     * @param leSpectacleDuContratDeCession 
     */
    
     public void modifier(String numeroContratCession, double montantGlobalCession, Spectacle leSpectacleDuContratDeCession) {
        this.numeroContratCession = numeroContratCession;
        this.montantGlobalContrat = montantGlobalCession;
        this.leSpectacleDuContratDeCession = leSpectacleDuContratDeCession;
        this.edition = false; //l'indicateur d'édition est mis à FAUX
    }
     
     /**
      * 
      * @return 
      */

    public String getNumeroContratCession() {
        return numeroContratCession;
    }
    
    /**
     * 
     * @param numeroContratCession 
     */

    public void setNumeroContratCession(String numeroContratCession) {
        this.numeroContratCession = numeroContratCession;
    }
    
    /**
     * 
     * @return 
     */

    public double getMontantGlobalContrat() {
        return montantGlobalContrat;
    }
    
    /**
     * 
     * @param montantGlobalContrat 
     */

    public void setMontantGlobalContrat(double montantGlobalContrat) {
        this.montantGlobalContrat = montantGlobalContrat;
    }
    
    /**
     * 
     * @return 
     */

    public Spectacle getLeSpectacleDuContratDeCession() {
        return leSpectacleDuContratDeCession;
    }
    
    /**
     * 
     * @param leSpectacleDuContratDeCession 
     */

    public void setLeSpectacleDuContratDeCession(Spectacle leSpectacleDuContratDeCession) {
        this.leSpectacleDuContratDeCession = leSpectacleDuContratDeCession;
    }
    
    /**
     * 
     * @return 
     */

    public ArrayList<Representation> getLesRepresentations() {
        return lesRepresentations;
    }
    
    /**
     * 
     * @param lesRepresentations 
     */

    public void setLesRepresentations(ArrayList<Representation> lesRepresentations) {
        this.lesRepresentations = lesRepresentations;
    }
    
    /**
     * 
     * @param uneRepresentation 
     */
    
    public void ajouterRepresentation (Representation uneRepresentation) {
        lesRepresentations.add(uneRepresentation);
    }
    
    /**
     * 
     * @param numeroRepresentation 
     */
    
    public void supprimerRepresentation (int numeroRepresentation) {
        lesRepresentations.remove(numeroRepresentation); //problème dû à l'id d'une représentation
    }
    
    /**
     * 
     * @return 
     */
    
    public int donnerNombreRepresentation() {
        return lesRepresentations.size();
    }
    
    /**
     * 
     * @return 
     */

    public boolean isEdition() {
        return edition;
    }
    
    /**
     * 
     * @param edition 
     */

    public void setEdition(boolean edition) {
        this.edition = edition;
    }
    
    /**
     * 
     * @return
     * @throws ParseException 
     */
    
    public Representation getPremiereRepresentation () throws ParseException {
        //on recherche la première représentation pour ce contrat de production
        if (lesRepresentations.isEmpty()) {
            return null; 
        }
        
        else {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            //on initialise la première représentation comme étant la première de la collection
            Date plusPetiteDate = dt.parse(lesRepresentations.get(0).getDate());
            Representation premiereRepresentation = lesRepresentations.get(0);
            //on cherche la véritable première représentation dans la collection
            for (Representation uneRepresentation : lesRepresentations) {
                Date laDateCourante = dt.parse(uneRepresentation.getDate());
                if (laDateCourante.before(plusPetiteDate)) {
                    plusPetiteDate = laDateCourante;
                    premiereRepresentation = uneRepresentation;
                }
            }
            return premiereRepresentation;
        }
    }
    
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "ContratCession{" + "numeroContratCession=" + numeroContratCession + ", montantGlobalCession=" + montantGlobalContrat + ", leSpectacleDuContratDeCession=" + leSpectacleDuContratDeCession + ", lesRepresentations=" + lesRepresentations + '}';
    }
    
}
