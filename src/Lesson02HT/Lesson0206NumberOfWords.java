package Lesson02HT;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0206NumberOfWords {
    public static void main(String[] args) {
        String text = "The Alan Turing Law is an informal term for the law in the United Kingdom," +
                "contained in the Policing and Crime Act 2017, which serves as an amnesty law to" +
                " pardon men who were cautioned or convicted under historical legislation that" +
                " outlawed homosexual acts. The provision is named after Alan Turing, the World War II" +
                " codebreaker and computing pioneer, who was convicted for gross indecency in 1952. " +
                "Turing received a royal pardon (posthumously) in 2013. The law applies in England and Wales" ;
        int counter = 0;
        String[] words = text.split("\\W+") ;
        for (String s: words) {
            counter++;
        }
        System.out.println(counter) ;
    }
}
