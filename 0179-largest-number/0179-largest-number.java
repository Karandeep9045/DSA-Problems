class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        for(int i =0;i<n;i++){
            arr[i] = Integer.toString(nums[i]);
        } 

        Arrays.sort(arr, new Comparator<String>(){
            public int compare (String a, String b){
                String first = a+b;
                String sec = b+a;
                return sec.compareTo(first);
            }
        });
        if(arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for(String val : arr){
            sb.append(val);
        }
        return sb.toString();
    }
}