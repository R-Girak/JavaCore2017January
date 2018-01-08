package Chapter01;

/**
 * Created by Gerka on 08-Jan-18.
 */
public class Ch01_004_GalToLit {

    // Программа перевода галлонов в литры

    public static void main(String[] args) {
        double gallons; // volume in gallons
        double liters;  // volume in liters

        gallons = 10;

        liters = gallons * 3.7854;

        System.out.println(gallons + " of gallons is equal to " + liters + " liters");
    }
}
