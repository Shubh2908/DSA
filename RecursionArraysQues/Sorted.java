package RecursionArraysQues;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9 , 10};
        System.out.println(sorted(arr, 0));

    }
    static boolean sorted(int[] arr, int index){
        // Base Condition
        if (index == arr.length-1){   // Element at the last index gives always true.
            return true;
        }
        // Recursive call
        // Recursively checks if the rest of the array (from next index onward) is sorted.f
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
