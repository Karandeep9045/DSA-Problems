// --------------Recursion----------
class Solution {
    public void reverseString(char[] s) {
        int left =0;
        int right =s.length-1;
        reverse(left , right , s);
    }

    public static void reverse(int left , int right , char[] s){
        if(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }else{
            return;
        }
        reverse(left+1,right-1,s);
    }
}


// --------binary search--------
// class Solution {
//     public void reverseString(char[] s) {
//         int left =0;
//         int right =s.length-1;
//         while(left<right){
//             char temp = s[left];
//             s[left] = s[right];
//             s[right]= temp;
//             left++;
//             right--;
//         }
//     }
// }