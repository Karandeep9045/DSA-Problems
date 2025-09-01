class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        permutation(nums, used, new ArrayList<>(), result);
        return result;
    }

    public static void permutation(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> result) {
        if (curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == false) {
                used[i] = true;
                curr.add(nums[i]);
                permutation(nums, used, curr, result);
                used[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }
}