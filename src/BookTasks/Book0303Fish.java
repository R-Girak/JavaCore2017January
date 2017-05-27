package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0303Fish extends Book0301Pet {

    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("Ныряю на глубину " + howDeep + " футов");
        System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
        return currentDepth;
    }
    public String say(String something) {
        return "Ты чё? Ты не знаешь, что рыбы не разговаривают?";
    }
}
