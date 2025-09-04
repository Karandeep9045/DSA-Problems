class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        combination(arr, k, n, new ArrayList<>(), list, 0);
        return list;
    }

    public static void combination(int[] arr, int k, int n, List<Integer> curr, List<List<Integer>> list, int idx) {
        if (n == 0 && curr.size() == k) {
            list.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] <= n) {
                curr.add(arr[i]);
                combination(arr, k, n - arr[i], curr, list, i + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }
}