class Solution {
    public List<String> letterCombinations(String ques) {
        List<String> list = new ArrayList<>();
        if(ques.length() == 0)return list;
        phoneletter(ques, "", list);
        return list;
    }
    static String[] code = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void phoneletter(String ques, String ans,List<String> list){
        if(ques.length() == 0){
            list.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = code[ch-48];
        for(int i =0;i<press.length();i++){
            phoneletter(ques.substring(1), ans+press.charAt(i), list);
        }

    } 
}