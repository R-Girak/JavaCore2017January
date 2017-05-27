package Lesson02HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0201PrimeNumbers {
    public static void main(String[] args) {
        //Вывести в консоль все простые числа, встречающиеся от 0 до 10 000
        int until = 10000;
        int start = 2;
        boolean isPrime;
        System.out.println(start);

        for (int i = 3; i < until; i+=2) {
            isPrime = true;

            for (int j = 3; j < i; j+=2) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }


    }
}