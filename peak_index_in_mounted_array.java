package BinarySearch;

public class peak_index_in_mounted_array {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[mid+1]){
                //you are in decreasing part of the array.
                //this may be the answer, but look at the left.
                //this is why end is not equal to mid-1.
                end = mid;
            }
            else {
                // you are in increasing part of the array.
                start = mid+1;//Bcoz we know that mid + 1 element > mid element.
            }

        }
         // In the end, start==end and pointing towards the largest number becoz of the two checks above.
        // Start and end are always trying to find max element in the above 2 checks.
        //Hence, when they are pointing to just one element, that is the max one becoz that is what the checks say.
        return start;
    }
}
