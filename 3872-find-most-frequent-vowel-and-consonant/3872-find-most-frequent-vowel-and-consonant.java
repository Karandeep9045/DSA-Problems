class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int vow = 0;
        int cons = 0;
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            char ch = pair.getKey();
            int val = pair.getValue();
            if ("aeiou".indexOf(ch) >= 0) {
                vow = Math.max(vow, val);
            } else {
                cons = Math.max(cons, val);
            }
        }
        return vow + cons;
    }
}