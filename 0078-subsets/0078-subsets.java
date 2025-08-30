import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void subset(int[] nums, int i, List<Integer> curr, List<List<Integer>> result) {
        if (i == nums.length) {   
            result.add(new ArrayList<>(curr)); 
            return;
        }


        subset(nums, i + 1, curr, result);

        curr.add(nums[i]);
        subset(nums, i + 1, curr, result);


        curr.remove(curr.size() - 1);
    }
}
