class Solution {

    int[] dp;
    int climb(int n){
        if(n<=2) return n;

        if(dp[n]!= -1) return dp[n];

        return dp[n]=climb(n-1)+climb(n-2);
    }
    public int climbStairs(int n) {
         dp=new int[n+1];

        Arrays.fill(dp,-1);

       return climb(n);

        
    }
}