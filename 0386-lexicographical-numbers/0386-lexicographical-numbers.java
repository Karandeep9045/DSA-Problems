class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            printnumber(n, String.valueOf(i), list);
        }
        List<Integer> intlist = list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return intlist;

    }

    public static void printnumber(int n, String ans, List<String> list) {
        int val = Integer.parseInt(ans);
        if (val > n)
            return;
        list.add(ans);
        for (int i = 0; i <= 9; i++) {
            printnumber(n, ans + i, list);
        }

    }
}