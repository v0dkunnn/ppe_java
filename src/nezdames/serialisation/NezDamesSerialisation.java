
package nezdames.serialisation;

import classesMetier.ContratCession;
import java.util.ArrayList;
import classesMetier.Intermittent;
import classesMetier.Lieu;
import classesMetier.PersonneStructure;
import classesMetier.Spectacle;
import classesMetier.Structure;
import classesMetier.User;

/**
 *
 * @author gaellecastel
 */

public class NezDamesSerialisation {

     // déclaration des collections
    
    public static ArrayList<Intermittent> lesIntermittents = new ArrayList();
    public static ArrayList<User> lesUsers = new ArrayList();
    public static ArrayList<Spectacle> lesSpectacles = new ArrayList();
    public static ArrayList<ContratCession> lesContratsCession = new ArrayList();
    public static ArrayList<Lieu> lesLieux = new ArrayList();
    public static ArrayList<PersonneStructure> lesPersonnes = new ArrayList();
    public static ArrayList<Structure> lesStructures = new ArrayList();
 
    public static int index =-1 ;

    /**
     * @param args the command line arguments
     */
    
    /**
     * @param args 
     */
    
    public static void main(String[] args){
        
        MenuPrincipal a = new MenuPrincipal();
        a.setVisible(true);
    }
}
    

