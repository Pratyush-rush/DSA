class Solution {
    public int maxSubArray(int[] nums) {

        //as questio is about largest sum also have negative integer we will think about kadane

        int curr=nums[0];
        int ans=nums[0];
      

        for(int i=1;i<nums.length;i++){

            curr=Math.max(curr+nums[i],nums[i]);
            ans=Math.max(ans,curr);

        }
        return ans;


        
        
    }
}