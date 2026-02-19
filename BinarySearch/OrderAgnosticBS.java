package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99,89,56,45,34,23,12};
        int target =56 ;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr , int target){
           int start = 0;
           int end = arr.length-1;

//           Find whether the array is sorted in Ascending Or Descending
             boolean isAsc = arr[start] < arr[end];

             while(start<=end){

                int mid = start + (end-start)/2;

                if (arr[mid] == target){
                    return mid;
                }

                if (isAsc){
                    if (target < arr[mid]){
                        end  = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }  else {
                    if (target > arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }


             }
              return -1;
    }





}
