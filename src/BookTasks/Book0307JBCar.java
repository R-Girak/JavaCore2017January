package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0307JBCar extends Book0305Car {
    public String drive(int howLong) {
        String carResponse = "Проехали " + howLong*180 + " км";
        return carResponse;
    }
}

