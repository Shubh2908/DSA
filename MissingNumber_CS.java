package Sorting;
// https://leetcode.com/problems/missing-number
// Amazon Question

class MissingNumber_CS {

    public int missingNumber(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i];   // Means Index = Value, bcoz index and value both will start from zero in this question.
            if (arr[i]< arr.length && arr[i] != arr[correct]) {  // If value at that index is not following above condition,
                swap (arr, i, correct);     // than swaps it with correct index.
            }
            else {
                i++;
            }
        }
        // Search for first missing number
        for (int index = 0; index< arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
        // Case2
        return arr.length;
    }
    static void swap (int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}