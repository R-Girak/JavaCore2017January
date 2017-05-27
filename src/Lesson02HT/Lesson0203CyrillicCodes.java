package Lesson02HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0203CyrillicCodes {
    public static void main(String[] args) {
        //Вывести в консоль, номера кириллических символов (то есть русских, привычных нам)
        char a = 'а';
        char A = 'А';
        for (int i = 0; i <= 65535; i++) {
            if (i == (int) A) {
                for (int j = i; j <= (i + 33); j++) {
                    System.out.println(j + " - " + (char) j);
                }
            }
            if (i == (int) a) {
                for (int j = i; j <= (i + 33); j++) {
                    System.out.println(j + " - " + (char) j);
                }
            }
        }
    }
}