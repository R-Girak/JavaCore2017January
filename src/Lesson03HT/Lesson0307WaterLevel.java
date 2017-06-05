package Lesson03HT;

/**
 * Created by Gerka on 05-Jun-17.
 */
public class Lesson0307WaterLevel {
    public Lesson0307WaterLevel() {
    }

    public static void main(String[] args) {
        int[] waterLines = arrayGen(30);
        System.out.println("Зафиксированные уровни замеров воды");
        printArray(waterLines);
        System.out.print("Максимальный уровень воды: ");
        System.out.println(maxValue(waterLines));
    }

    static void printArray(int[] arrayRandom) {
        int[] var1 = arrayRandom;
        int var2 = arrayRandom.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int element = var1[var3];
            System.out.print(element + "\t");
        }

        System.out.println("\n");
    }

    static int maxValue(int[] arrayRandom) {
        int maxValue = -1;
        int[] var2 = arrayRandom;
        int var3 = arrayRandom.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int element = var2[var4];
            if(element > maxValue) {
                maxValue = element;
            }
        }

        return maxValue;
    }

    static int[] arrayGen(int size) {
        int[] array = new int[size];

        for(int i = 0; i < size; ++i) {
            array[i] = (int)(1.0D + Math.random() * 100.0D);
        }

        return array;
    }
}
