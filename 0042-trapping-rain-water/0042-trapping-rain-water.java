class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        //for left auxilary array 
        int highest = 0;
        for (int i = 0; i < n; i++) {
            highest = Math.max(highest, nums[i]);
            left[i] = highest;
        }

         //for right auxilary array
        highest = 0;
        for (int i = n - 1; i >= 0; i--) {
            highest = Math.max(highest, nums[i]);
            right[i] = highest;
        }


        // calculate trapped water
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - nums[i];
        }

        return ans;
    }
}