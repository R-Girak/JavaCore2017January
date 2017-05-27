package Lesson01HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0104CyclesStar {
    public static void main(String[] args) {
        // Выяснить возраст всех 4-х братьев, сумма 3-х из которых поочередно, - 30, 32, 32, 35
        int Sum123 = 30; // Сумма лет первого, второго, третьего
        int Sum234 = 32; // Сумма лет второго, третьего, четвертого
        int Sum341 = 32; // Сумма лет третьего, четвертого, первого
        int Sum412 = 35; // Сумма лет четвертого, первого, второго

        int minAge = 0;  //минимальный возраст
        int maxAge = 35; //максимальный возраст

        for (int i = minAge; i <= maxAge ; i++) {
            for (int j = minAge; j <= maxAge ; j++) {
                for (int k = minAge; k <= maxAge ; k++) {
                    for (int l = minAge; l <= maxAge ; l++) {
                        if ((i + j + k) == Sum123 && (j + k + l) == Sum234 && (k + l + i) == Sum341 && (l + i + j) == Sum412) {
                            System.out.println("Возраст первого:    " + i);
                            System.out.println("Возраст второго:    " + j);
                            System.out.println("Возраст третьего:   " + k);
                            System.out.println("Возраст четвертого: " + l);
                        }
                    }
                }
            }
        }
    }
}
