package PrometheusL2;

/**
 * Created by Gerka on 27-Dec-17.
 */
public class SquareRoot {

    public static void main(String[] args) {
        double a = 11;
        double b = 10;
        double c = 23;

        if (a == 0 & b == 0) {
            System.out.println("x1=") ;
            System.out.println("x2=") ;
        }
        else if (a == 0 & c == 0) {
            System.out.println("x1=" + 0.0) ;
            System.out.println("x2=" + 0.0) ;
        }
        else {
            if (b * b - 4 * a * c > 0) {
                System.out.println("x1=" + ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
                System.out.println("x2=" + ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)));
            } else if (b * b - 4 * a * c == 0) {
                System.out.println("x1=" + (-b / (2 * a)));
                System.out.println("x2=" + (-b / (2 * a)));
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
            }
        }
    }
}
