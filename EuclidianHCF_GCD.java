// Euclidian Algorithm
// GCD (a, b) = GCD [rem(b, a), a]
package maths;

public class EuclidianHCF_GCD {
    public static void main(String[] args) {
        System.out.print(gcd(17, 5));

    }
    static int gcd (int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
