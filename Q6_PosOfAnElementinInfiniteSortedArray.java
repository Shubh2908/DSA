package BinarySearch;

public class Q6_PosOfAnElementinInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target = 10;
        System.out.println(ans(arr,target));

    }

    static int ans(int[]arr, int target){
//        first find the range
//        first start with box of size 2

          int start = 0;
          int end = 1;

//        Condition for the target to lie in the range
        while (target > arr[end]){

            int temp = end+1; // this is my new start
//            double the box value.
//            new end  = previous end + sizeOfCurrentBox*2
            end = end + (end - start + 1 ) * 2;

            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }


    static int binarySearch(int[] arr , int target, int start, int end){
        while (start<=end){
//            finding middle element
//            int mid = (start+end)/2 // sometimes not possible due to exceeding limit of start and end
            int mid = start +(end-start)/2;


            if (target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
