class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;
        for(int i =0;i<n;i++){
            int index = Math.abs(nums[i])-1;

            if(nums[index]<0){
                duplicate = Math.abs(nums[i]);
            }else{
                nums[index]*= -1;
            }
        }

        for(int i =0;i<n;i++){
            if(nums[i]>0){
                missing = i+1;
            }
        }
        return new int[]{duplicate,missing};
    }
}