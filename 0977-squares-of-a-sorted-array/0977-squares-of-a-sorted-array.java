class Solution {
    public int[] sortedSquares(int[] nums) {
        //array
        //sorted
        //rearrange or sort after squaring so use 2 pointer


        int[] ans=new int[nums.length];

        int i=0;
        int j=nums.length-1;
        int pos=nums.length-1;

        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){

                ans[pos]=nums[i]*nums[i];
                i++;

            }
            else{
                ans[pos]=nums[j]*nums[j];
                j--;
            }

            pos--;


        }

        return ans;


       

        
    }
}