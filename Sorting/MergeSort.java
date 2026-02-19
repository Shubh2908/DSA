package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3 ,2, 1};
        arr  = merge(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] merge(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/ 2;

        // Arrays.copyOfRange = Copies a specified range of the specified array into a new array
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeboth(left, right);
    }

    private static int[] mergeboth(int[] left, int[] right) {

        int[] mix = new int[left.length + right.length];

        int i = 0;   // Pointer for the left array
        int j = 0;   // Pointer for the right array
        int k = 0;   // Pointer for the new array i.e is mixed

        while(i < left.length && j < right.length ){

            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }

            else {
                mix[k] = right[j];
                j++;
            }

            k++;
        }
        // It may be possible that one of the array is not complete
        // Copy the remaining elements

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;

        }

        while (j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
