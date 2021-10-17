package TimeComplexity;

import java.util.*;
import java.util.Map.Entry;

public class  SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] primes = SOE(n);
        for(int i = 0; i < primes.length; i++) {
            if(primes[i]) System.out.println(i);
        }
    }

    static boolean[] SOE(int n) {
        boolean[] prime = new boolean[n + 1];

        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for(int table = 2; table * table <= n; table++)
        {
            if(prime[table]) {
                for (int multiple = 2; table * multiple <= n; multiple++)
                    prime[multiple * table] = false;
            }
        }
        return prime;
    }

}
