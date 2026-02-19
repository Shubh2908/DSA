package Recursion;

public class FibonacciRecursion {

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    static int fibo(int n){
        // Base Condition
        if (n<2){
            return n;
        }
        // Recursive call
        return fibo(n-1) + fibo(n-2);
    }
}
