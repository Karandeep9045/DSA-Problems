class Solution {
    public int uniquePaths(int m, int n) {
        long res = 1;
        int len = m + n - 2;
        int k = Math.min(m - 1, n - 1);

        for (int i = 1; i <= k; i++) {
            res = res * (len - k + i) / i;
        }
        return (int)res;
    }
}

// class Solution {

//     public int uniquePaths(int m, int n) {
//         return robot(m,n,0,0);
//     }

//     public static int robot(int m , int n , int H, int V) {
//         if(H==m-1 && V==n-1){
//             return 1;
//         }
//         if(H == m || V==n ){
//             return 0;
//         }
//         int a = robot(m,n,H,V+1);
//         int b =robot(m,n,H+1,V);
//         return a+b;
//     }
// }