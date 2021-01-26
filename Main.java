
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BigInteger fact = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++ ){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}

