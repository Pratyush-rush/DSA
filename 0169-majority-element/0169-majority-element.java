class Solution {
    public int majorityElement(int[] nums) {
      

        int res = 0;
        int count = 0;

        for(int num : nums){

            if(count == 0){
                res = num;
            }

            if(num == res){
                count++;
            }
            else{
                count--;
            }
        }

        return res;
    }
}
        //basically what we are doing it we are updating count if same appear but decreasing when diff appear
        //this doesnt affect our final answer as we know number in majority will have more count than other
  