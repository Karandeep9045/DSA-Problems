class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch : arr){
            if(isvowel(ch)){
                sb.append(ch);
            }
        }

        char[] newarr = sb.toString().toCharArray();
        Arrays.sort(newarr);
        int index =0;
        for(int i =0;i<arr.length;i++){
            if(isvowel(arr[i])){
                arr[i] = newarr[index++];
            }
        }
        return new String(arr);
    }
    public static boolean isvowel(char c){
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
    }
}