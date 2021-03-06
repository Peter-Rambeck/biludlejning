package model;

public abstract class Bil {

    private String regNr;
    private String maerke;
    private String model;
    private int aargang;
    private int antalDoere;

    // Bil Construktor
    public Bil(String regNr, String maerke, String model, int aargang, int antalDoere) {
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.aargang = aargang;
        this.antalDoere = antalDoere;
    }

    // Calculate the common Grøn afgift that apply for all cars, no regard of type.
    // Specific car type afgift is then added in sub-class.
    public double beregnFaellesAfgift(double kmPrl) {
        int retVal = 0;
        if (kmPrl < 50) { retVal = 330; }
        if (kmPrl < 20) { retVal = 1050; }
        if (kmPrl < 15) { retVal = 2340; }
        if (kmPrl < 10) { retVal = 5500; }
        if (kmPrl < 5) { retVal = 10470; }
        return retVal;
    }

    // Abstract Grøn ejerafgift Method - calculated in subclass.
    public abstract double beregnGroenEjerAfgift();

    public String toStringFaelles() {
        return "Reg. nr.: " + regNr +
                ", Maerke: " + maerke +
                ", Model: " + model +
                ", Aargang: " + aargang +
                ", Antal doere: " + antalDoere;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public String getModel() {
        return model;
    }

    public int getAargang() {
        return aargang;
    }

    public int getAntalDoere() {
        return antalDoere;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAargang(int aargang) {
        this.aargang = aargang;
    }

    public void setAntalDoere(int antalDoere) {
        this.antalDoere = antalDoere;
    }

}
