class Solution {
    public void sortColors(int[] nums) {

    // int x=0;
    // int i=0;
    //     int j=0;
    //     int k=0;

        // while(x<nums.length){
        //     if(nums[x]==0){
        //         i++;

        //     }

        //     else if(nums[x]==1){
        //         j++;
        //     }

        //     else{
        //         k++;
        //     }

        //     x++;
        // }



        // int y=0;

        // while(y<i){
        //     nums[y]=0;
        //     y++;
        // }

        // while(y<j+i){
        //     nums[y]=1;
        //     y++;
        // }

        // while(y<nums.length){
        //      nums[y]=2;
        //     y++;

        // }


int low=0;
int mid=0;
int high=nums.length-1;

while( mid<=high){
    if(nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;

        mid++;
        low++;


    }

    else if(nums[mid]==1){
        mid++;
    }

    else{
        int temp=nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;

    
        high--;

    }
}



        
    }
}