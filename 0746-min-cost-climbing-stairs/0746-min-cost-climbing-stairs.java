class Solution {
   int s;
   int[] dp;

   int climb(int[] cost,int s){
    if(s<=1) return 0;

    if(dp[s]!=-1) return dp[s];

    return dp[s]=Math.min(cost[s-1]+climb(cost,s-1),cost[s-2]+climb(cost,s-2));
   }


    public int minCostClimbingStairs(int[] cost) {
        s=cost.length;

        //using top down method
        dp=new int[s+1];

        Arrays.fill(dp,-1);

        return climb(cost,s);







        
    }
}