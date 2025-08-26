class Solution {
    public String smallestNumber(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];
        Stack<Integer> st = new Stack<>();
        int count = 1;
        for (int i = 0; i <= n; i++) {
            if (i == s.length() || s.charAt(i) == 'I') {
                ans[i] = count;
                count++;
                while (!st.isEmpty()) {
                    int val = st.pop();
                    ans[val] = count;
                    count++;
                }
            } else {
                st.push(i);
            }
        }
        String result = "";
        for(int i =0;i<ans.length;i++){
            result+=ans[i];
        }
        return result;
    }
}