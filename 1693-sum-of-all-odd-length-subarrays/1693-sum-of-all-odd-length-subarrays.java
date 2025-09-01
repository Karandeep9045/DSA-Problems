class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int tsum = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int length = end - start + 1;
                if (length % 2 == 1) {
                    for (int i = start; i <= end; i++) {
                        tsum += arr[i];
                    }
                }

            }

        }
        return tsum;
    }
}