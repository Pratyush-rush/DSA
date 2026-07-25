class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> ans=new HashMap<>();

        int prfsum=0;
        int count=0;

          

        ans.put(0, 1);

   
      

        for (int x : nums) {

            prfsum+= x;

            int remainder = prfsum % k;

            if (remainder < 0)
                remainder += k;

            count += ans.getOrDefault(remainder, 0);

            ans.put(remainder,
                    ans.getOrDefault(remainder, 0) + 1);
        }

        return count;
        
    }
}