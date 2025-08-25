
//using two pointer 
class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int lmax = 0;
        int rmax =0;
        int ans =0;

        while(l<r){
            lmax = Math.max(lmax,arr[l]);
            rmax = Math.max(rmax,arr[r]);

            if(lmax<rmax){
                ans += lmax-arr[l];
                l++;
            }else{
                 ans += rmax-arr[r];
                r--;
            }
        }
        return ans;
    }
}


// using aux array

// class Solution {
//     public int trap(int[] nums) {
//         int n = nums.length;
//         int[] left = new int[n];
//         int[] right = new int[n];

//         //for left auxilary array 
//         int highest = 0;
//         for (int i = 0; i < n; i++) {
//             highest = Math.max(highest, nums[i]);
//             left[i] = highest;
//         }

//          //for right auxilary array
//         highest = 0;
//         for (int i = n - 1; i >= 0; i--) {
//             highest = Math.max(highest, nums[i]);
//             right[i] = highest;
//         }


//         // calculate trapped water
//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             ans += Math.min(left[i], right[i]) - nums[i];
//         }

//         return ans;
//     }
// }