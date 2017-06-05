package Lesson03HT;

/**
 * Created by Gerka on 05-Jun-17.
 */
public class Lesson0306Fish extends Lesson0302Pet {
    public Lesson0306Fish() {
        this.setWeight(100.0D + Math.random() * 300.0D);
    }

    public void voice() {
        super.voice();
        System.out.println("...");
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.print("Рыба");
    }
}
