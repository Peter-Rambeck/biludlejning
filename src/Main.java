import model.*;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage("Corner");

        Bil benzin = new Benzinbil("kj2222",
                "Nissan",
                "Fin",
                1877,
                5,
                95,
                20.0);
        // System.out.println(benzin);
        // System.out.println(benzin.beregnGroenEjerAfgift());
        garage.tilfoejBil(benzin);
        // System.out.println(garage.beregnGroenAfgiftForBilPark());


        Bil el = new Elbil("el2222",
                "Nissan",
                "Fin",
                1877,
                5,
                52.0,
                385,
                200.0);
        // System.out.println(el);
        // System.out.println(el.beregnGroenEjerAfgift());
        garage.tilfoejBil(el);
        // System.out.println(garage.beregnGroenAfgiftForBilPark());

        Bil diesel = new Dielselbil("el2222",
                "Nissan",
                "Fin",
                1877,
                5,
                false,
                12.0);
        // System.out.println(diesel);
        // System.out.println(diesel.beregnGroenEjerAfgift());
        garage.tilfoejBil(diesel);
        System.out.print(garage);
        System.out.println("Samlet ejerafgift for garagen: " + garage.beregnGroenAfgiftForBilPark()+" DKK");
    }

}
