class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        gp(0,0,list,"",n);
        return list;
    }

    public static void gp(int open , int close ,List<String> list,String ans,int n) {
        if (open == n && close == n) {
            list.add(ans);
            return;
        }
        if (open < n) {
            gp(open+1,close,list,ans+"(",n);
        }
        if (close < open) {
            gp(open,close+1,list,ans+")",n);
        }

    }
}