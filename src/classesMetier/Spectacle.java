package classesMetier;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author gaellecastel
 */
public class Spectacle implements Serializable {

    private String numeroObjet ;
    private int duree ;
    private String titre ;
    private int anneeCreation ;
    private double prixVenteTheorique ;
    private String fichierContraintesTechniques ;
    private String fichierSynopsis ;
    private ArrayList<Intermittent> lesIntermittents;
    
    /**
     * 
     * @param numeroObjet
     * @param duree
     * @param titre
     * @param anneeCreation
     * @param prixVenteTheorique
     * @param fichierContraintesTechniques
     * @param fichierSynopsis
     * @param lesIntermittentsParticipants 
     */

    public Spectacle(String numeroObjet, int duree, String titre, int anneeCreation, double prixVenteTheorique, String fichierContraintesTechniques, String fichierSynopsis, ArrayList<Intermittent> lesIntermittentsParticipants) {
        this.numeroObjet = numeroObjet;
        this.duree = duree;
        this.titre = titre;
        this.anneeCreation = anneeCreation;
        this.prixVenteTheorique = prixVenteTheorique;
        this.fichierContraintesTechniques = fichierContraintesTechniques;
        this.fichierSynopsis = fichierSynopsis;
        this.lesIntermittents = lesIntermittentsParticipants; 
    }
    
    /**
     * 
     * @param numeroObjet
     * @param duree
     * @param titre
     * @param anneeCreation
     * @param prixVenteTheorique
     * @param fichierContraintesTechniques
     * @param fichierSynopsis
     * @param lesIntermittentsParticipants 
     */
    
    public void modifier(String numeroObjet, int duree, String titre, int anneeCreation, double prixVenteTheorique, String fichierContraintesTechniques, String fichierSynopsis, ArrayList<Intermittent> lesIntermittentsParticipants) {
        this.numeroObjet = numeroObjet;
        this.duree = duree;
        this.titre = titre;
        this.anneeCreation = anneeCreation;
        this.prixVenteTheorique = prixVenteTheorique;
        this.fichierContraintesTechniques = fichierContraintesTechniques;
        this.fichierSynopsis = fichierSynopsis;
        this.lesIntermittents = lesIntermittentsParticipants; 
    }
    
    /**
     * 
     * @return 
     */

    public String getNumeroObjet() {
        return numeroObjet;
    }
    
    /**
     * 
     * @param numeroObjet 
     */

    public void setNumeroObjet(String numeroObjet) {
        this.numeroObjet = numeroObjet;
    }
    
    /**
     * 
     * @return 
     */

    public int getDuree() {
        return duree;
    }
    
    /**
     * 
     * @param duree 
     */

    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    /**
     * 
     * @return 
     */

    public String getTitre() {
        return titre;
    }
    
    /**
     * 
     * @param titre 
     */

    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    /**
     * 
     * @return 
     */

    public int getAnneeCreation() {
        return anneeCreation;
    }
    
    /**
     * 
     * @param anneeCreation 
     */

    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }
    
    /**
     * 
     * @return 
     */

    public double getPrixVenteTheorique() {
        return prixVenteTheorique;
    }
    
    /**
     * 
     * @param prixVenteTheorique 
     */

    public void setPrixVenteTheorique(double prixVenteTheorique) {
        this.prixVenteTheorique = prixVenteTheorique;
    }
    
    /**
     * 
     * @return 
     */

    public String getFichierContraintesTechniques() {
        return fichierContraintesTechniques;
    }
    
    /**
     * 
     * @param fichierContraintesTechniques 
     */

    public void setFichierContraintesTechniques(String fichierContraintesTechniques) {
        this.fichierContraintesTechniques = fichierContraintesTechniques;
    }
    
    /**
     * 
     * @return 
     */

    public String getFichierSynopsis() {
        return fichierSynopsis;
    }
    
    /**
     * 
     * @param fichierSynopsis 
     */

    public void setFichierSynopsis(String fichierSynopsis) {
        this.fichierSynopsis = fichierSynopsis;
    }
    
    /**
     * 
     * @return 
     */
    
    public ArrayList<Intermittent> getLesIntermittents() {
        return lesIntermittents;
    }
    
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        String chaine = "Spectacle{" + "numeroObjet=" + numeroObjet + ", duree=" + duree + ", titre=" + titre + ", anneeCreation=" + anneeCreation + ", prixVenteTheorique=" + prixVenteTheorique + ", fichierContraintesTechniques=" + fichierContraintesTechniques + ", fichierSynopsis=" + fichierSynopsis + '}';
        for (Intermittent unIntermittent : this.lesIntermittents) {
                    chaine = chaine+" "+unIntermittent.toString();
                }
        
        return chaine;
    }
    

}
