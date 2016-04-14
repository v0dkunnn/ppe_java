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

    public String getNumeroObjet() {
        return numeroObjet;
    }

    public void setNumeroObjet(String numeroObjet) {
        this.numeroObjet = numeroObjet;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeCreation() {
        return anneeCreation;
    }

    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    public double getPrixVenteTheorique() {
        return prixVenteTheorique;
    }

    public void setPrixVenteTheorique(double prixVenteTheorique) {
        this.prixVenteTheorique = prixVenteTheorique;
    }

    public String getFichierContraintesTechniques() {
        return fichierContraintesTechniques;
    }

    public void setFichierContraintesTechniques(String fichierContraintesTechniques) {
        this.fichierContraintesTechniques = fichierContraintesTechniques;
    }

    public String getFichierSynopsis() {
        return fichierSynopsis;
    }

    public void setFichierSynopsis(String fichierSynopsis) {
        this.fichierSynopsis = fichierSynopsis;
    }
    
    public ArrayList<Intermittent> getLesIntermittents() {
        return lesIntermittents;
    }

    @Override
    public String toString() {
        String chaine = "Spectacle{" + "numeroObjet=" + numeroObjet + ", duree=" + duree + ", titre=" + titre + ", anneeCreation=" + anneeCreation + ", prixVenteTheorique=" + prixVenteTheorique + ", fichierContraintesTechniques=" + fichierContraintesTechniques + ", fichierSynopsis=" + fichierSynopsis + '}';
        for (Intermittent unIntermittent : this.lesIntermittents) {
                    chaine = chaine+" "+unIntermittent.toString();
                }
        
        return chaine;
    }

}
