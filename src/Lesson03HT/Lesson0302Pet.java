package Lesson03HT;

/**
 * Created by Gerka on 05-Jun-17.
 */
public abstract class Lesson0302Pet implements Comparable<Lesson0302Pet> {
    private double weight;

    public Lesson0302Pet() {
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void voice() {
        System.out.println("Животное говорит:");
    }

    public void whoAmI() {
        System.out.print("Я - ");
    }

    public int compareTo(Lesson0302Pet o) {
        return this.getWeight() < o.getWeight()?-1:(this.getWeight() > o.getWeight()?1:0);
    }
}
