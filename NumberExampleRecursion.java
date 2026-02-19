package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
          print(10);
    }

    static void print(int n){
        // base condition
        if (n == 1){
            System.out.println(1);
            return;
        }
        // Recursive calls
        // If you are calling a function again and again, you can treat it as a separate call in the stack

        // This is called tail recursion
        // This is the last function call
        System.out.println(n);
        print(n - 1);
    }
}
