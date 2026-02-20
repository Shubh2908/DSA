package maths;
// Sieve of Eratosthenes
// It is one of the fastest and most elegant algorithms to find all prime numbers up to a given number N.
// It is far more efficient than checking each number one by one.

import java.util.Arrays;

public class Seive {
    public static void main(String[] args) {
        int n = 50;
        seive(n);
    }

    static void seive(int n){

        boolean[]primes = new boolean[n+1];
        Arrays.fill(primes, true);// Initially assumes every no. is prime
        primes[0] = false;
        primes[1] = false;

        for (int p = 2; p*p <= n ; p++) {
            if (primes[p]){ // Using this condition after above loop to check if P is still prime

                // Using this loop only for marking all the multiples of P as composite
                for (int multiple = p*p; multiple <=n ; multiple+=p) {
                    primes[multiple] = false;

                }
            }

        }

        // Print the primes

        for (int i= 2; i <=n ; i++) {
            if (primes[i]){
                System.out.print(i + " ");
            }

        }
    }
}
