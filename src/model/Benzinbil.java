package model;

public class Benzinbil extends Bil {

    private int oktanTal;
    private double kmPrl;

    // Benzinbil Constructor
    public Benzinbil(String regNr, String maerke, String model, int aargang, int antalDoere, int oktanTal, double kmPrl) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.oktanTal = oktanTal;
        this.kmPrl = kmPrl;
    }

    // Calculate Grøn ejerafgift for Benzinbil.
    @Override
    public double beregnGroenEjerAfgift() {
        return this.beregnFaellesAfgift(this.getKmPrl());
    }

    @Override
    public String toString() {
        String str = new String();
        str = this.toStringFaelles();
        str = "Benzinbil " + str +
                " oktanTal: " + oktanTal +
                ", kmPrl: " + kmPrl;
        return str;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(double kmPrl) {
        this.kmPrl = kmPrl;
    }

}
