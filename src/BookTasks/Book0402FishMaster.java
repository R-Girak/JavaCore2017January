package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0402FishMaster {
    public static void main(String[] args) {
        Book0401Fish myFish = new Book0401Fish();
        System.out.println(myFish.say("Привет, хозяин!"));
        myFish.dive(2);
        myFish.dive(97);
        myFish.dive(3);
        myFish.sleep();
    }
}