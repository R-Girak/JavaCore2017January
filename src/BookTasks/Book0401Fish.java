package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0401Fish extends Book0301Pet {

    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка и не могу нырять глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        }
        else  {
            System.out.println("Ныряю еще " + howDeep + " метров");
            System.out.println("Я на глубине " + currentDepth + " метров ниже уровня моря");
        }
        return currentDepth;
    }
    public String say(String something) {
        return "Ты чё? Ты не знаешь, что рыбы не разговаривают?";
    }
}
