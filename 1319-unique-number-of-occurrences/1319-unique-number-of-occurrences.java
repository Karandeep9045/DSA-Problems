class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map =new  HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int e : map.keySet()){
            int value = map.get(e);
            set.add(value);
        }
        return set.size() != map.size()? false: true;
    }
}