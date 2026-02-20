package maths;

public class Factors {
    public static void main(String[] args) {
        factors2(30);
    }

    // This is common method for finding factors
    // But in this method things are repeated like 5*4 & 4*5 both gives 20
    // T.C.= O(n)
    static void factors1(int n){
        for (int i = 1; i < n; i++) {
            if ( n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Second Method
    //T.C.= 0(sqrt(n))
    static void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {

            if (n % i == 0) {
                if (n/i == i){ // Condition like 6*6 = 36, so to print it only one time we use it
                    System.out.print(i);
                }
                else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
}
