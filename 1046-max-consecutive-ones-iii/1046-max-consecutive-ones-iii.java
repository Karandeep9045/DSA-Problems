class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int countzero = 0;
        int ans = 0;
        int n = nums.length;

        while(j<n){
            if(nums[j] == 0){
                countzero++;
            }

            while(countzero>k){
                if(nums[i] == 0){
                    countzero--;
                }
                i++;
            }

            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}