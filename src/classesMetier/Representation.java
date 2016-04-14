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

    public Representation(int idRepresentation, Date date, Date heureDebut, Lieu leLieu) throws ParseException {

        this.idRepresentation = idRepresentation;
        DateFormat simpleFormat = new SimpleDateFormat("dd-MM-yyyy");
        String maDate = simpleFormat.format(date);
        this.date = maDate;

        DateFormat df = new SimpleDateFormat("HH:mm");
        this.heureDebut = df.format(heureDebut);
        this.leLieu = leLieu;
    }

    public int getIdRepresentation() {
        return idRepresentation;
    }

    public void setIdRepresentation(int idRepresentation) {
        this.idRepresentation = idRepresentation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(Date date) {
        DateFormat simpleFormat = new SimpleDateFormat("dd-MM-yyyy");
        String maDate = simpleFormat.format(date);
        this.date = maDate;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        DateFormat df = new SimpleDateFormat("HH:mm");
        this.heureDebut = df.format(heureDebut);
    }

    public Lieu getLeLieu() {
        return leLieu;
    }

    @Override
    public String toString() {
        return "Representation{" + "idRepresentation=" + idRepresentation + ", date=" + date + ", heureDebut=" + heureDebut + '}';
    }

}
