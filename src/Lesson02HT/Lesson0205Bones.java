package Lesson02HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0205Bones {
    public static void main(String[] args) {
        int Sum2 = 0;
        int Sum3 = 0;
        int Sum4 = 0;
        int Sum5 = 0;
        int Sum6 = 0;
        int Sum7 = 0;
        int Sum8 = 0;
        int Sum9 = 0;
        int Sum10 = 0;
        int Sum11 = 0;
        int Sum12 = 0;

        for (int i = 1; i < 10000; i++) {
            int throwBone1 = (int) (1 + Math.random() * 6);
            int throwBone2 = (int) (1 + Math.random() * 6);
            if ((throwBone1 + throwBone2) == 2) {
                Sum2++;
            }
            ;
            if ((throwBone1 + throwBone2) == 3) {
                Sum3++;
            }
            ;
            if ((throwBone1 + throwBone2) == 4) {
                Sum4++;
            }
            ;
            if ((throwBone1 + throwBone2) == 5) {
                Sum5++;
            }
            ;
            if ((throwBone1 + throwBone2) == 6) {
                Sum6++;
            }
            ;
            if ((throwBone1 + throwBone2) == 7) {
                Sum7++;
            }
            ;
            if ((throwBone1 + throwBone2) == 8) {
                Sum8++;
            }
            ;
            if ((throwBone1 + throwBone2) == 9) {
                Sum9++;
            }
            ;
            if ((throwBone1 + throwBone2) == 10) {
                Sum10++;
            }
            ;
            if ((throwBone1 + throwBone2) == 11) {
                Sum11++;
            }
            ;
            if ((throwBone1 + throwBone2) == 12) {
                Sum12++;
            }
            ;
        }
        System.out.println("02 - " + Sum2 );
        System.out.println("03 - " + Sum3 );
        System.out.println("04 - " + Sum4 );
        System.out.println("05 - " + Sum5 );
        System.out.println("06 - " + Sum6 );
        System.out.println("07 - " + Sum7 );
        System.out.println("08 - " + Sum8 );
        System.out.println("09 - " + Sum9 );
        System.out.println("10 - " + Sum10);
        System.out.println("11 - " + Sum11);
        System.out.println("12 - " + Sum12);
    }
}
