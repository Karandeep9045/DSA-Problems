class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int length = 0;
        int[] prefix = new int[n];
        int count =0;
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int j =0;j<n;j++){
            if(prefix[j] == k){
                count++;
            }

            int val = prefix[j] -k;
            if(map.containsKey(val)){
                count += map.get(val);
            }

            map.put(prefix[j] , map.getOrDefault(prefix[j],0)+1);
        }
        return count;

    }
}