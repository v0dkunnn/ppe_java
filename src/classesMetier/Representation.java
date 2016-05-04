package classesMetier;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author gaellecastel
 */

public class Representation implements Serializable {

    private int idRepresentation;
    private String date;
    private String heureDebut;
    private Lieu leLieu;
    
    /**
     * 
     * @param idRepresentation
     * @param date
     * @param heureDebut
     * @param leLieu
     * @throws ParseException 
     */

    public Representation(int idRepresentation, Date date, Date heureDebut, Lieu leLieu) throws ParseException {

        this.idRepresentation = idRepresentation;
        DateFormat simpleFormat = new SimpleDateFormat("dd-MM-yyyy");
        String maDate = simpleFormat.format(date);
        this.date = maDate;

        DateFormat df = new SimpleDateFormat("HH:mm");
        this.heureDebut = df.format(heureDebut);
        this.leLieu = leLieu;
    }
    
    /**
     * 
     * @return 
     */

    public int getIdRepresentation() {
        return idRepresentation;
    }
    
    /**
     * 
     * @param idRepresentation 
     */

    public void setIdRepresentation(int idRepresentation) {
        this.idRepresentation = idRepresentation;
    }
    
    /**
     * 
     * @return 
     */

    public String getDate() {
        return date;
    }
    
    /**
     * 
     * @param date 
     */

    public void setDate(Date date) {
        DateFormat simpleFormat = new SimpleDateFormat("dd-MM-yyyy");
        String maDate = simpleFormat.format(date);
        this.date = maDate;
    }
    
    /**
     * 
     * @return 
     */

    public String getHeureDebut() {
        return heureDebut;
    }
    
    /**
     * 
     * @param heureDebut 
     */

    public void setHeureDebut(Date heureDebut) {
        DateFormat df = new SimpleDateFormat("HH:mm");
        this.heureDebut = df.format(heureDebut);
    }
    
    /**
     * 
     * @return 
     */

    public Lieu getLeLieu() {
        return leLieu;
    }
    
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "Representation{" + "idRepresentation=" + idRepresentation + ", date=" + date + ", heureDebut=" + heureDebut + '}';
    }
    
}
