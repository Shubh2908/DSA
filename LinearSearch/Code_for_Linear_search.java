package LinearSearch;

public class Code_for_Linear_search {

    public static void main(String[] args) {
        int[] nums = {};
        int target = 2;
       int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int arr[] ,int target){
        if (arr.length == 0)
            return-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
               return i;
            }
        }
        return -1;
    }



}
