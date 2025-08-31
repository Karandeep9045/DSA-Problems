class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            printnumber(n, String.valueOf(i), list);
        }
        return list;    
    }

    public static void printnumber(int n, String ans, List<Integer> list) {
        int val = Integer.parseInt(ans);
        if (val > n)
            return;
        list.add(val);
        for (int i = 0; i <= 9; i++) {
            printnumber(n, ans + i, list);
        }

    }
}