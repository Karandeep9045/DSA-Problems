class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        combination(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }

    public static void combination(int[] candidates, int target, int idx, List<Integer> curr,
            List<List<Integer>> list) {
        if (target == 0) {
            list.add(new ArrayList<>(curr));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1])
                continue;
            if (target < candidates[i])
                break;

            curr.add(candidates[i]);
            combination(candidates, target - candidates[i], i + 1, curr, list);
            curr.remove(curr.size() - 1);

        }
    }
}