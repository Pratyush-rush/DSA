class Solution {
    public int pivotIndex(int[] nums) {
      int left=0;
      int right=0;

      int sum=0;

      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      }

      for(int i=0;i<nums.length;i++){

        if(i>0){
        left=left+nums[i-1];}

        right=sum-left-nums[i];

        if(right==left){
            return i;
        }
      }

      return -1;

      

        
    }
}