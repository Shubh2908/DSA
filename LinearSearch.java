package RecursionArraysQues;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr  = {1,3,4,6,8};
        int target  = 4;
        System.out.println(findIndex(arr, target, 0));

    }
    static boolean search(int[] arr, int target, int index){
        // Base Condition
        if (index == arr.length){
            return false;
        }

        // Recursive Call
        return arr[index] == arr[target] || search(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        // Base Condition
        if (index == arr.length){
            return -1;
        }

        if (arr[index] == target){
            return index;
        }

        return findIndex(arr, target, index + 1);
    }
}

