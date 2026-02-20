package maths;

public class PrimeNo {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "  " + isprime(i));
        }
    }
    static boolean isprime(int n){
        if (n <=1){
            return false;
        }
        int c = 2;

        // Why "c * c <=n": If n = 36, possible divisors that matter are:1  2  3  4  5  6
        // But after √36 = 6, checking 7, 8, 9… is useless.
        // So checking divisors only till √n is enough.
        while (c * c <=n){
            if (n % c ==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
