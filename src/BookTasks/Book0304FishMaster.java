package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0304FishMaster {
    public static void main(String[] args) {
        Book0303Fish myFish = new Book0303Fish();
        System.out.println(myFish.say("Привет, хозяин!"));
        myFish.dive(2);
        myFish.dive(3);
        myFish.sleep();
    }
}