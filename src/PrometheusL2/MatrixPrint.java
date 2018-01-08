package PrometheusL2;

/**
 * Created by Gerka on 27-Dec-17.
 */
public class MatrixPrint {
    public static void main(String args[]){
        String space, star;

        for (int i = 1; i < 26; i++) {

            if (i <= 10 && i != 5) {
                space = " ";
                star = "*";
            }
            else {
                space = "";
                star = " *";
            }


            if (i%5 > 0) {
                if (i == 1 || i == 5 || i == 7 || i == 9 || i == 13 || i == 17 || i == 19 || i == 21 || i == 25) {
                    System.out.print(space + star + " ");
                }
                else {
                    System.out.print(space + i + " ");
                }
            }

            else {
                if (i == 1 || i == 5 || i == 7 || i == 9 || i == 13 || i == 17 || i == 19 || i == 21 || i == 25) {
                    System.out.println(star + " ");
                }
                else {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
