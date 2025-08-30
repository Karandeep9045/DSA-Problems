class Solution {
    public int[] shuffle(int[] nums, int n) {
        int num1 = 0;
        int num2 =n;
        int[] result = new int[2*n];
        int k=0;
        for(int i=0;i<=n-1;i++){
            result[k]=nums[num1];
            k++;num1++;
            result[k]= nums[num2];
            k++;num2++;
        }
        return result;
    }
}