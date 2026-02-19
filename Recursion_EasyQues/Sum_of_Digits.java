package Recursion_EasyQues;

public class Sum_of_Digits {
    public static void main(String[] args) {
        System.out.println(sum(5555));

    }
      static int sum(int n){
        if (n==0){
            return 0;
        }
        // rem = n%10
        // n = n/10
        return (n%10) + sum(n/10);
    }
}
