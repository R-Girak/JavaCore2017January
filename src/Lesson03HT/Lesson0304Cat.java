package Lesson03HT;

/**
 * Created by Gerka on 05-Jun-17.
 */
public class Lesson0304Cat extends Lesson0302Pet {
    public Lesson0304Cat() {
        this.setWeight(1000.0D + Math.random() * 2000.0D);
    }

    public void voice() {
        super.voice();
        System.out.println("Мяу");
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.print("Кот");
    }
}
