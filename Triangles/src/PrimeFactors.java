import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.Prime;

/**
 * Created by fergyo on 15/12/2016.
 */
public class PrimeFactors {
    List<Integer> generate(int n){
        List<Integer> results = new ArrayList<>();
        if(PrimeFactors.isPrime(n)) return results;

        for(int div = 2; div <= n; div++){
            if(!PrimeFactors.isPrime(div)) continue;
            if(n % div == 0){
                results.add(div);
                n = n / div;
                div = 1;
            }
        }
        return results;
    }

    private static boolean isPrime(int n){
        if (n==2) return true;
        if (n%2==0) return false;
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}







