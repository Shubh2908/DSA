package Recursion_EasyQues;

public class Pdt_of_Digits {
    public static void main(String[] args) {
        System.out.println(pdt(2934));
    }
    static int pdt(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10) * pdt(n/10);
    }
}
