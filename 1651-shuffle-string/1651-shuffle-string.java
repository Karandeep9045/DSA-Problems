class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int val = indices[i];
            ans[val] = s.charAt(i);
        }
        String stringans = new String(ans);
        return stringans;
    }
}