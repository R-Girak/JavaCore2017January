package PrometheusL2;

/**
 * Created by Gerka on 04-Jan-18.
 */
public class ShellSort {

    // Напишіть застосування для сортування масиву методом сортування Шелла (ShellSort). Завдання додаткове! (без оцінювання)

    public static void main(String[] args) {
        int[] array = {887, 710, 581, 29, 261, 694, 501, 580, 582, 991};
        int length = array.length;
        int switcher;

        for (int d = length/2; d >= 1; d /= 2) {
            for (int i = d; i < length; i++) {
                for (int j = i; j >= d && array[j - d] > array[j]; j -= d) {
                    switcher = array[j - d];
                    array[j - d] = array[j];
                    array[j] = switcher;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}