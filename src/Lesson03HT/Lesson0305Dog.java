package Lesson03HT;

/**
 * Created by Gerka on 05-Jun-17.
 */
public class Lesson0305Dog extends Lesson0302Pet {
    public Lesson0305Dog() {
        this.setWeight(1500.0D + Math.random() * 5000.0D);
    }

    public void voice() {
        super.voice();
        System.out.println("Гав");
    }

    public void whoAmI() {
        super.whoAmI();
        System.out.print("Пёс");
    }
}

