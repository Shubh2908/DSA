package BinarySearch;

public class Q1_Ceiling {
    public static void main(String[] args) {
        int[] arr = {34,45,53,64,75,86};
        int target = 47;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

    static int Ceiling(int[]arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid+1;

            }
            else{
                return mid;
            }
        }
        return start;
    }
}
