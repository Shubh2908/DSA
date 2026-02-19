package Recursion;

public class NumberExamples {
    public static void main(String[] args) {
        // Write a function that print numbers from 1 to 5
          print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        print2(2);

    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    // Function body here changes
    static void print5(int n){
        System.out.println(n);
    }
}
