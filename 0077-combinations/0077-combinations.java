class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        boolean[] used = new boolean[n];
        combinations(nums, used, new ArrayList<>(), result, 0, k);
        return result;
    }

    public static void combinations(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> result, int idx,
            int k) {
        if (curr.size() == k) {
            result.add(new ArrayList(curr));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (used[i] == false) {
                used[i] = true;
                curr.add(nums[i]);
                combinations(nums, used, curr, result, i + 1, k);
                used[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }
}