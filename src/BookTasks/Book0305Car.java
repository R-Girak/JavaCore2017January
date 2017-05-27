package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0305Car {
    int speed;
    float price;
    String color;
    String model;

    //   speed = 60 ;

    public void start() {
        System.out.println("Погнали!");
    }

    public void stop() {
        System.out.println("Пррр!");
    }

    public String drive(int howLong) {
        String carResponse = "Проехали " + howLong*60 + " км";
        return carResponse;
    }
}
