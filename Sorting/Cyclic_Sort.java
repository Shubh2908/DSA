// Generally Use Cyclic sort When range is given in question like [0, N]

package Sorting;
import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i] - 1;   // Means Index = Value-1, bcoz index is starting from zero.
            if (arr[i] != arr[correct]) {  // If value at that index is not following above condition,
               swap (arr, i, correct);     // than swaps it with correct index.
            }
            else {
                i++;
            }
        }
    }
    static void swap (int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
