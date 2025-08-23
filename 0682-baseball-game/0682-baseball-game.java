class Solution {
    public int calPoints(String[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<n;i++){
            if(arr[i].equals("C")){
                stack.pop();
            }else if(arr[i].equals("D") ){
                stack.push(stack.peek()*2);
            }else if(arr[i].equals("+")){
                int top = stack.pop();
                int newtop = top+stack.peek();
                stack.push(top);
                stack.push(newtop);
            }else{
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        int ans =0;
        while(!stack.isEmpty()){
            ans += stack.peek();
            stack.pop();
        }
        return ans;
    }
}