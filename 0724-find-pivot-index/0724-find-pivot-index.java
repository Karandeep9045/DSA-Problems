class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] arrp = new int[n];
        int[] arrs = new int[n];
        arrp[0] = nums[0];
        arrs[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            arrp[i] = arrp[i - 1] + nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            arrs[i] = arrs[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (arrp[i] == arrs[i]) {
                return i;
            }
        }

        return -1;
    }
}