package Lesson02HT;

import java.util.Scanner;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0202SpaceShips {
    public static void main(String[] args) {
        //02.	Вы доставляете провизию на Марс в виде ящиков одинакового размера.
        // У вас есть космические корабли и контейнеры.
        // В каждый корабль влезает максимум 11 контейнеров.
        // В каждый контейнер ­ не более 34 ящиков.
        // Ящики, контейнеры и корабли пронумерованы.
        // Напишите программу, которая будет распределять ящики по контейнерам и кораблям в зависимости от их количества, а также напечатает, сколько всего нужно кораблей и контейнеров.
        // На вход программы через консоль должно подаваться число ящиков.
        // На выходе результат должен выглядеть следующим образом:
        // Корабль 1:
        // Контейнер 1:
        // Ящик 1
        // Ящик 2
        // ...
        // Ящик 34
        // Контейнер 2:
        // Ящик 1
        // Ящик 2
        // ...
        System.out.println("How many boxes do You want to send?");
        Scanner in = new Scanner(System.in);
        int NumberOfBoxes = in.nextInt();

        int ShipCapacity = 5;
        int ContainerCapacity = 4;
        int Conteiners;
        int Ships;

        if (NumberOfBoxes%ContainerCapacity != 0) {
            Conteiners = NumberOfBoxes / ContainerCapacity + 1;
        }
        else {
            Conteiners = NumberOfBoxes / ContainerCapacity;
        }

        if (Conteiners%ShipCapacity != 0) {
            Ships = Conteiners/ShipCapacity + 1;
        }
        else {
            Ships = Conteiners/ShipCapacity;
        }

        System.out.println("Number of Ships = " + Ships);
        System.out.println("Number of Conteiners = " + Conteiners);

        for (int i = 1; i <= Ships; i++) {
            System.out.println("Ship #" + i);
            if (i < Ships) {
                for (int f = 1; f <= ShipCapacity; f++) {
                    System.out.println("Conteiner #" + f);
                    for (int f1 = 1; f1 <= ContainerCapacity; f1++) {
                        System.out.println("Box #" + f1);
                    }
                }
            }


            else {
                for (int j = 1; j <= Conteiners%ShipCapacity; j++) {
                    System.out.println("Conteiner #" + j);
                    if (j < Conteiners%ShipCapacity) {
                        for (int k1 = 1; k1 <= ContainerCapacity; k1++) {
                            System.out.println("Box #" + k1);
                        }
                    }
                    else {
                        for (int j1 = 1; j1 <= NumberOfBoxes - (Conteiners - 1) * ContainerCapacity ; j1++) {
                            System.out.println("Box #" + j1);
                        }
                    }
                }
            }

        }

    }
}

