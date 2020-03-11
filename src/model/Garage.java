package model;
import java.util.ArrayList;

public class Garage {

    private String navn;
    private ArrayList<Bil> bilListe;

    // Garage Constructor
    public Garage(String navn) {
        this.navn = navn;
        this.bilListe = new ArrayList<Bil>();
    }

    // Method to add all cars instantiated to the bilListe ArrayList.
    public void tilfoejBil(Bil bil) {
        this.bilListe.add(bil);
    }

    @Override
    public String toString() {
        String str = new String();
        str = "Garage: " + this.navn + "\n";
        for (Bil bil: bilListe) {
            str = str + bil + "\n";
        }
        return str;
    }

    // Calculate and sum the individual Grøn ejerafgift for all cars in the 'bilListe' ArrayList.
    public double beregnGroenAfgiftForBilPark() {
        double afgift = 0;
        for (Bil bil: bilListe) {
            afgift = afgift + bil.beregnGroenEjerAfgift();
        }
        return afgift;
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<Bil> getBilListe() {
        return bilListe;
    }
}
