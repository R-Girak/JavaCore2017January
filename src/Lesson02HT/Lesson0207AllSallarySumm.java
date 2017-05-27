package Lesson02HT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Gerka on 27-May-17.
 */
public class Lesson0207AllSallarySumm {
    public static void main(String[] args) {
        String text = "Коля заработал 1050 рублей, Миша - 17523 рубля, а Катя - 5020 рублей" ;
        int total = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text) ;
        while (m.find()) {
            total += Integer.parseInt(m.group(0)) ;
        }
        System.out.println(total) ;
    }
}
