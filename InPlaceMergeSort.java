package Sorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
         mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSortInplace(int[] arr, int s, int e) {
        if (e - s == 1){
            return;
        }
        int mid = (s + e)/ 2;

        // Arrays.copyOfRange = Copies a specified range of the specified array into a new array
        mergeSortInplace(arr, 0, mid);
        mergeSortInplace(arr, mid, e);

         mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {

        int[] mix = new int[e - s];

        int i = s;   // Pointer for the left array
        int j = m;   // Pointer for the right array that will start from mid in this case
        int k = 0;   // Pointer for the new array i.e is mixed

        while(i < m && j < e ){

            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }

            else {
                mix[k] = arr[j];
                j++;
            }

            k++;
        }
        // It may be possible that one of the array is not complete
        // Copy the remaining elements

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;

        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
