package model;

public class Dielselbil extends Bil {

    private boolean partikelFilter;
    private double kmPrl;

    public Dielselbil(String regNr, String maerke, String model, int aargang, int antalDoere, boolean partikelFilter, double kmPrl) {
        super(regNr, maerke, model, aargang, antalDoere);
        this.partikelFilter = partikelFilter;
        this.kmPrl = kmPrl;
    }

    @Override
    public double beregnGroenEjerAfgift() {

        // Same afgift as all cars
        double faelles = this.beregnFaellesAfgift(this.kmPrl);

        // If partikelfilter extra cash
        double partikelAfgift = 0;
        if ( partikelFilter ) {
            partikelAfgift = 0;
        }
        else {
            partikelAfgift = 1000.0;
        }

        // Adding udligningsafgift
        double udligning = 0;
        if (kmPrl < 50) { udligning = 130; }
        if (kmPrl < 20) { udligning = 1390; }
        if (kmPrl < 15) { udligning = 1850; }
        if (kmPrl < 10) { udligning = 2770; }
        if (kmPrl < 5) { udligning = 15260; }

        return faelles + udligning + partikelAfgift;
    }

    @Override
    public String toString() {
        String str = new String();
        String pf = new String();
        if (partikelFilter) {
            pf = "Ja";
        } else {
            pf = "Nej";
        }
        str = this.toStringFaelles();
        str = "Dieselbil " + str +
                " partikelFilter: " + pf +
                ", kmPrl: " + kmPrl;
        return str;
    }


    public boolean isPartikelFilter() {
        return partikelFilter;
    }

    public void setPartikelFilter(boolean partikelFilter) {
        this.partikelFilter = partikelFilter;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(double kmPrl) {
        this.kmPrl = kmPrl;
    }

}
