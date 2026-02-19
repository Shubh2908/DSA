// Q-1: To find maximum number in given array.

package Arrays;

public class Basic_Array {
    public static void main(String[] args) {
        int[] arr = {99,245,45,699,56};
        System.out.println(max(arr));
    }

    static int  max (int[] arr){
        int maxval  = arr[0];
        for (int i=1 ; i< arr.length; i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }

        }
        return maxval;
    }
}
