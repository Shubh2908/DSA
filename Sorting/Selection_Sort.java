package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {9,6,56,8,34,69};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr){
        for (int i = 0; i< arr.length; i++){
           //Find the max item in the remaining array and swap it with correct index.
           int last = arr.length - i - 1;
           int maxIndex = getMxIndex(arr,0, last);
           swap(arr, maxIndex, last);

        }
    }

    static void swap (int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMxIndex(int[] arr, int start,int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
