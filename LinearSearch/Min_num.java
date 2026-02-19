package LinearSearch;

public class Min_num {
    public static void main(String[] args) {
        int[] nums = {12,34,66,88,9,64,-4,-99,98};
        System.out.println(min(nums));
    }


    static int min(int[] nums) {

        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < ans) {
                ans = nums[i];
            }

        }
        return ans;
    }

}
