package Lesson01HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0102Boolean_OperatorIf {
    public static void main(String[] args) {
        //Правильно определить возрасты людей, несмотря на то, что они могут меняться
        int Misha = 98; // Возраст Миши
        int Vasya = 8; // Возраст Васи
        int Vadim = 18; // Возраст Вадима
        int oldest = 0; // Лет старшему
        int middle = 0; // Лет среднему
        int youngest = 0; // Лет младшему
        String comment = "";
        if (Vasya == Vadim || Vadim == Misha || Vasya == Misha)
        {comment = "But as You can see, some of the men have the same age" ;} ;

        if (Misha >= Vasya){
            if (Misha >= Vadim) {
                if (Vasya >= Vadim) {
                    oldest = Misha;
                    middle = Vasya;
                    youngest = Vadim; }
                else {
                    oldest = Misha;
                    middle = Vadim;
                    youngest = Vasya; } }
            else {
                oldest = Vadim;
                middle = Misha;
                youngest = Vasya; }}
        else {
            if (Vasya >= Vadim) {
                if (Misha >= Vadim) {
                    oldest = Vasya;
                    middle = Misha;
                    youngest = Vadim; }
                else {
                    oldest = Vasya;
                    middle = Vadim;
                    youngest = Misha; } }
            else {
                oldest = Vadim;
                middle = Vasya;
                youngest = Misha; } }

        System.out.println("The oldest man is " + oldest);
        System.out.println("The middle one is " + middle);
        System.out.println("The youngest man is " + youngest);
        System.out.println(comment);
    }
}
