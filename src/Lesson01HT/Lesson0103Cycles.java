package Lesson01HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0103Cycles {
    public static void main(String[] args) {
        String form; //негритенок, негритенка, негритят
        String go; // пошли, пошел
        String fun; // резвились, резвился
        for (int i = 10; i >0 ; i--) {
            if (i == 1) {
                form = "негритенок" ;
                go = "пошел" ;
                fun = "резвился" ;
            }
            else {
                go = "пошли" ;
                fun = "резвились" ;
                if (i == 2 || i == 3 || i == 4) { form = "негритенка"; }
                else { form = "негритят" ;}

            }
            System.out.println(i + " " + form + " " + go + " купаться в море,") ;
            System.out.println(i + " " + form + " " + fun + " на просторе.") ;
            if (i == 1) {
                System.out.println("И он утоп...") ; break ;
            }
            System.out.println("Один из них утоп, ему купили гроб. И вот вам результат:") ;
        }
    }
}