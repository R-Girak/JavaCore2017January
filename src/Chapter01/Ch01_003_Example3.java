package Chapter01;

/**
 * Created by Gerka on 08-Jan-18.
 */
public class Ch01_003_Example3 {
    public static void main(String[] args) {
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("First value of var: " + var);
        System.out.println("First value of x: " + x);
        System.out.println();

        var = var/4;
        x = x/4;

        System.out.println("Value of var after divide: " + var);
        System.out.println("Value of x after divide: " + x);
    }
}
