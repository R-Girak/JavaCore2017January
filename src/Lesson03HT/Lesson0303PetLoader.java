package Lesson03HT;

/**
 * Created by Gerka on 05-Jun-17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Lesson0303PetLoader {
    public Lesson0303PetLoader() {
    }

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList pets = new ArrayList();

        for(int i = 0; i < 10; ++i) {
            int pet = r.nextInt(3);
            if(pet == 0) {
                pets.add(new Lesson0304Cat());
            } else if(pet == 1) {
                pets.add(new Lesson0305Dog());
            } else {
                pets.add(new Lesson0306Fish());
            }
        }

        Collections.sort(pets, Lesson0302Pet::compareTo);
        Iterator var5 = pets.iterator();

        while(var5.hasNext()) {
            Lesson0302Pet var6 = (Lesson0302Pet)var5.next();
            var6.whoAmI();
            System.out.println(", мой вес: " + (int)var6.getWeight());
        }

    }
}
