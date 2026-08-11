class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> ans=new HashMap<>();

        int length=0;
        int one=0;
        int zero=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==0) zero++;
            else one++;

            int diff=zero-one;

            if(diff==0){
                length=Math.max(length,i+1);
            }

            if (ans.containsKey(diff)) {
                length = Math.max(length, i - ans.get(diff));
            } 
            else {
               
                ans.put(diff, i);
            }
        }

        return length;



            

        }

        
        
    }
