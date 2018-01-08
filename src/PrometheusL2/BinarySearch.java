package PrometheusL2;

/**
 * Created by Gerka on 04-Jan-18.
 */
public class BinarySearch {

//    Напишіть застосування, що виконує пошук заданого числа у відсортованому масиві — бінарний пошук
//    У випадку коли число знайдено виведіть на екран його позицію в масиві (позиції нумеруємо з нуля)
//    або -1 в іншому випадку

    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 110;

        int i = -1;
        int low = 0;
        int high = data.length;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (numberToFind == data[mid]) {
                i = mid;
                break;
            } else {
                if (numberToFind < data[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        System.out.println(i);
    }
}

