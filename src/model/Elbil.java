package model;

public class Elbil extends Bil {

    private double batteriKapacitet;
    private int maxKm;
    private double whPrKm;

    // Elbil Constructor
    public Elbil(String regNr, String maerke, String model, int aargang, int antalDoere, double batteriKapacitet, int maxKm, double whPrKm) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.batteriKapacitet = batteriKapacitet;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    // Calculate the Grøn ejerafgift for Elbil
    @Override
    public double beregnGroenEjerAfgift() {
        double kmPrl = 100/(this.getWhPrKm()/91.25);
        return this.beregnFaellesAfgift(kmPrl);
    }

    @Override
    public String toString() {
        String str = new String();
        str = this.toStringFaelles();
        str = "Elbil " + str +
                " maxKm: " + maxKm +
                ", whPrKm: " + whPrKm;
        return str;
    }


    public double getBatteriKapacitet() {
        return batteriKapacitet;
    }

    public void setBatteriKapacitet(double batteriKapacitet) {
        this.batteriKapacitet = batteriKapacitet;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

}

