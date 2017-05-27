package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0406ConvertTemp {
    public static void main(String[] args) {
        Book0405TemperatureConverter newTC = new Book0405TemperatureConverter();
        String temp = newTC.convertTemp(25, 'D');
        System.out.println(temp);
    }
}
