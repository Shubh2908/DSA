package LinearSearch;

public class Even_Number {
    public static void main(String[] args) {

        int[] arr = {12 , 1, 999, 466, 89, 9};
        System.out.println(findNumbers(arr));


    }

    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
            return count;

    }

//    Function to check whether the number contains even digits or not

    static boolean even (int num){
        int numberofDigits = digits(num);

        return numberofDigits % 2 ==0;
    }
//   Count number of digits in a number

    static int digits (int num){

            int count = 0;

            while (num > 0){
                count++;

                num = num/10;

            }

            return count;
    }




}
