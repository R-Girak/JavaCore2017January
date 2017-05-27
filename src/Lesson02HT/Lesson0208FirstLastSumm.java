package Lesson02HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0208FirstLastSumm {
    public static void main(String[] args) {
        //С помощью методов indexOf(), lastIndexOf(), substring()
        // написать код, который считает сумму заработка первого и последнего человека
        String text = "Коля заработал 1050 рублей, Миша - 17523 рубля, а Катя - 74577 рублей" ;
        char o = '1';
        char nine = '9';
        int FSS = 0; // First sum start
        int FSE = 0; // First sum end
        int LSS = 0; // Last sum start
        //   int LSE = 0; // Last sum end

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= (int)o && text.charAt(i) <= (int)nine) {
                FSS = i;
                break;
            }
        }
        FSE = text.indexOf("руб") - 1 ;
        int sum1 = Integer.parseInt(text.substring(FSS, FSE)) ;

        int LSE = text.lastIndexOf("руб") - 1 ;
        for (int j = LSE - 1 ; j > 0 ; j--) {
            if (text.charAt(j) < (int)o || text.charAt(j) > (int)nine) {
                LSS = j;
                break;
            }
        }
        int sum2 = Integer.parseInt(text.substring(LSS + 1, LSE)) ;

        System.out.println(sum1 + sum2) ;
    }
}
