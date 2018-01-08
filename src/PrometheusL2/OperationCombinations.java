package PrometheusL2;

/**
 * Created by Gerka on 27-Dec-17.
 */
public class OperationCombinations {
    public static void main(String[] args) {

        int i = 10;
        int n = i++ % 5;
        System.out.println(i);
        System.out.println(n);

        int j = 10;
        int k = ++ j% 5;
        System.out.println(j);
        System.out.println(k);

    }
}
