class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        //count for odd length
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; orbit < s.length(); orbit++) {
                int a = axis + orbit;
                int b = axis - orbit;
                if (a >= s.length() || b < 0 || s.charAt(a) != s.charAt(b)) {
                    break;
                }
                count++;
            }
        }
        // count for even length
        for (float axis = (float) 0.5; axis < s.length(); axis++) {
            for (float orbit = (float) 0.5; orbit < s.length(); orbit++) {
                int a = (int) (axis + orbit);
                int b = (int) (axis - orbit);
                if (a >= s.length() || b < 0 || s.charAt(a) != s.charAt(b)) {
                    break;
                }
                count++;
            }
        }
        return count;
    }
}