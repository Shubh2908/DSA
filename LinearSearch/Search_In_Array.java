package LinearSearch;

public class Search_In_Array {
    public static void main(String[] args) {

        int[]arr = {12,29,20,5,100,99,65,69};
        int target = 99;
        System.out.println(linearSearch(arr , target));

    }
//    Search in the array: Return the index if the item is found
//     Otherwise print -1

    static int linearSearch (int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element==target){
                return index;
            }
        }

//        this line is executed if none of the return statements above have executed
//        hence the target is not found

        return -1;

    }



}
