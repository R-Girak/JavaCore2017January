package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0306CarOwner {
    public static void main(String[] args) {
        Book0305Car myCar = new Book0305Car();
        myCar.start();
        System.out.println(myCar.drive(2));
        myCar.stop();

        Book0307JBCar myJBCar = new Book0307JBCar();
        myJBCar.start();
        System.out.println(myJBCar.drive(2));
        myJBCar.stop();
    }
}