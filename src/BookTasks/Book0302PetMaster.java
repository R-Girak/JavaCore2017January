package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0302PetMaster {
    public static void main(String[] args) {
        String petReaction;
        Book0301Pet myPet = new Book0301Pet();
        myPet.eat();
        petReaction = myPet.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
