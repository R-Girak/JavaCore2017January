package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0405TemperatureConverter {
    public String convertTemp(int temperature, char convertTo) {
        String converted;
        float newTemp;
        if (convertTo == 'C') {
            newTemp = (temperature - 32) * 5 / 9;
            converted = temperature + " F is equal to " + newTemp + " in C";
        }
        else if (convertTo == 'F') {
            newTemp = temperature * 9 / 5 + 32;
            converted = temperature + " C is equal to " + newTemp + " in F";
        }
        else {
            converted = "Incorrect data entered. Enter F or C";
        }
        return converted;
    }
}
