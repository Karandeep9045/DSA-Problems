class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combination(candidates, target, 0, new ArrayList<>(), list);
        return list;
    }

    public static void combination(int[] candidates , int target , int idx, List<Integer> curr, List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx ;i < candidates.length;i++){
            if(target >= candidates[i]){
                curr.add(candidates[i]);
                combination(candidates, target-candidates[i],i,curr,list);
                curr.remove(curr.size()-1);
            }
        }
    }
}