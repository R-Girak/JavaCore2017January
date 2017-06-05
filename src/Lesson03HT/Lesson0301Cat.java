package Lesson03HT;

/**
 * Created by Gerka on 05-Jun-17.
 */
public class Lesson0301Cat {
    private Double originWeight;
    private Double weight = Double.valueOf(1500.0D + 3000.0D * Math.random());
    private Double minWeight;
    private Double maxWeight;
    private Double totalAmount = Double.valueOf(0.0D);
    private static int catCount = 0;

    public static int getCatCount() {
        return catCount;
    }

    public Lesson0301Cat() {
        this.originWeight = this.weight;
        this.minWeight = Double.valueOf(1000.0D);
        this.maxWeight = Double.valueOf(9000.0D);
        ++catCount;
    }

    public static Double catWeightDifference(Lesson0301Cat cat1, Lesson0301Cat cat2) {
        Double diff = Double.valueOf(Math.abs(cat1.getWeight().doubleValue() - cat2.getWeight().doubleValue()));
        return diff;
    }

    public double catWeight(double cw) {
        return cw;
    }

    public static boolean isAlive(Lesson0301Cat cat) {
        return !cat.getStatus().equals("Dead") && !cat.getStatus().equals("Exploded");
    }

    public void meow() {
        Double var1 = this.weight;
        Double var2 = this.weight = Double.valueOf(this.weight.doubleValue() - 1.0D);
        System.out.println("Meow!");
    }

    public void feed(Double amount) {
        this.weight = Double.valueOf(this.weight.doubleValue() + amount.doubleValue());
        this.totalAmount = Double.valueOf(this.totalAmount.doubleValue() + amount.doubleValue());
    }

    public void drink(Double amount) {
        this.weight = Double.valueOf(this.weight.doubleValue() + amount.doubleValue());
    }

    public void toilet() {
        this.weight = Double.valueOf(this.weight.doubleValue() - this.weight.doubleValue() / 50.0D);
    }

    public Double getWeight() {
        return this.weight;
    }

    public String getStatus() {
        return this.weight.doubleValue() < this.minWeight.doubleValue()?"Dead":(this.weight.doubleValue() > this.maxWeight.doubleValue()?"Exploded":(this.weight.doubleValue() > this.originWeight.doubleValue()?"Sleeping":"Playing"));
    }

    public String totalMeal() {
        return this.totalAmount + "";
    }
}
