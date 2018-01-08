package PrometheusL2;

/**
 * Created by Gerka on 04-Jan-18.
 */
public class ArraySort {

//  Напишіть застосування для сортування масиву методом бульбашки

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        int switcher;

        for (int k = 0; k < length; k++) {
            for (int j = length-1 ; j > k; j--) {
                if (array[j - 1] > array[j]) {
                    switcher = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = switcher;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
