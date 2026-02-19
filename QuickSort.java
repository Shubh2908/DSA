package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums, int low, int high){

        // Here low and high are indices
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = nums[m];


        // This part of Quick Sort tries to place elements:
        //-> All smaller than pivot → left side
        //-> All greater than pivot → right side

        // Here start(s) and end(e) are pointers
        while (s <=e){

            while(nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot ){
                e--;
            }


            // This condition starts when both the pointers stop
            // This means the pointers have NOT crossed → still valid to swap.
            if (s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // Now my pivot is at correct index, please sort two halves now

        sort(nums, low, e);
        sort(nums, s, high);
    }
}
