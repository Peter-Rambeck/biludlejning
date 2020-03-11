import model.*;

public class Main {

    public static void main(String[] args) {

        // Create new garage object of the Garage class.
        Garage garage = new Garage("Corner");

        // Create a 'Benzinbil' object/instance of the 'Bil' class
        Bil aygoBenzin = new Benzinbil("BX44586",
                "Toyota",
                "AYGO",
                2020,
                3,
                95,
                20.0);
        // Add the object to the 'bilListe' ArrayList
        garage.tilfoejBil(aygoBenzin);

        // Create a 'Benzinbil' object/instance of the 'Bil' class
        Bil upBenzin = new Benzinbil("BS69366",
                "VW",
                "UP",
                2015,
                5,
                95,
                24.4);
        // Add the object to the 'bilListe' ArrayList
        garage.tilfoejBil(upBenzin);

        // Create an 'Elbil' object/instance of the 'Bil' class
        Bil konaEl = new Elbil("80MXM08",
                "Hyundai",
                "JUKE",
                2019,
                5,
                110.0,
                289,
                154.0);
        // Add the object to the 'bilListe' ArrayList
        garage.tilfoejBil(konaEl);

        // Create an 'Elbil' object/instance of the 'Bil' class
        Bil eqcEl = new Elbil("CK65680",
                "Mercedes-Benz",
                "EQC",
                2019,
                5,
                80.0,
                374,
                160.0);
        // Add the object to the 'bilListe' ArrayList
        garage.tilfoejBil(eqcEl);

        // Create a 'Dieselbil' object/instance of the 'Bil' class
        Bil loungeDiesel = new Dielselbil("GH748269",
                "Fiat",
                "Lounge",
                2009,
                3,
                false,
                25.6);
        // Add the object to the 'bilListe' ArrayList
        garage.tilfoejBil(loungeDiesel);

        // Create a 'Dieselbil' object/instance of the 'Bil' class
        Bil cx30Diesel = new Dielselbil("CM13663",
                "Mazda",
                "CX-30",
                2019,
                5,
                true,
                16.7);
        // Add the object to the 'bilListe' ArrayList
        garage.tilfoejBil(cx30Diesel);

        // Print out the full ArrayList
        System.out.print(garage);
        // Compile, sum and print out total Grøn afgift for all cars in the garage
        System.out.println("Samlet ejerafgift for garagen: " + garage.beregnGroenAfgiftForBilPark()+" DKK");
    }

}
