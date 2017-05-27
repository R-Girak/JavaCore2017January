package Lesson02HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0204Chess {
    public static void main(String[] args) {
        //Вывести в консоль шахматную доску, в виде специальных character
        int wc = 9989;
        int bc = 9724;
        int width = 8;
        int height = 8;
        char next = '\n';

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i % 2 == j % 2) {
                    System.out.print((char) wc);
                } else {
                    System.out.print((char) bc);
                }
            } ;
            System.out.print((char) next);
        }
    }
}

