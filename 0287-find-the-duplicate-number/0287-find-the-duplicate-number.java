class Solution {
    public int findDuplicate(int[] nums) {

        //let say [1,3,4,2,2] we use binary search to find it as number is from 1 to n means it should have n number
        //find mid here that is 2 so between 1 to 2 it must have 2 number we then count it if more than that means duplicate is between them

        // int lo = 1;
        // int hi = nums.length - 1;

        // while(lo < hi){

        //     int mid = lo + (hi - lo)/2;

        //     int count = 0;

        //     for(int num : nums){
        //         if(num <= mid)
        //             count++;
        //     }

        //     if(count > mid){
        //         hi = mid;
        //     }else{
        //         lo= mid + 1;
        //     }
        // }

        // return lo;

        //array
        //now point index according to their value we will notice a cycle as one index will be pointed 2 times
        //so use slow fast
  int slow=0;
  int fast=0;

  while(true){
    slow=nums[slow];
    fast=nums[fast];
    fast=nums[fast];

    if(slow==fast){
        slow=0;

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
  }



    }
}