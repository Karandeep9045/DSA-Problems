class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int ans = 1;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                len += 1;
            } else {
                ans = Math.max(ans, len);
                len = 1;
            }
        }
        ans = Math.max(ans, len);
        return ans;

    }
}