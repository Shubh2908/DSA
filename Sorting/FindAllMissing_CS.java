// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1798236632/
// Google question

package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing_CS {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i< nums.length){
            int correct = nums[i];   // Means Index = Value, bcoz index and value both will start from zero in this question.
            if (nums[i]< nums.length && nums[i] != nums[correct]) {  // If value at that index is not following above condition,
                swap (nums, i, correct);     // than swaps it with correct index.
            }
            else {
                i++;
            }
        }
        // Just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length ; index++) {
            if (nums[index]!= index+1){  //If the element at the index does not contain Index+1.
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap (int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
