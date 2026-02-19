package Recursion_EasyQues;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(sum(100));

    }
    static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int sum(int n){
        if (n <= 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
