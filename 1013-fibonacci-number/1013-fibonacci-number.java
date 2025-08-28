class Solution {
    public int fib(int n) {
        int[] arr = new int[31];
        arr[0] = 0;
        arr[1] = 1;
        for(int i =2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        } 
        return arr[n];
    }
}


// -----------------  Recursion---------------
// class Solution {
//     public int fib(int n) {
//         int ans = fibo(n);
//         return ans;

//     }

//     public static int fibo(int n ) {
//         if (n == 0 || n == 1) {
//             return n;
//         }
//         int f1 = fibo(n - 1);
//         int f2 = fibo(n - 2);
//         return f1 + f2;
//     }
// }