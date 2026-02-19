package Arrays;

import java.util.Arrays;

public class ReerseArrays{
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static int reverse(int[] arr, int start, int end){

        start = 0;
        end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return 1;
    }

}

