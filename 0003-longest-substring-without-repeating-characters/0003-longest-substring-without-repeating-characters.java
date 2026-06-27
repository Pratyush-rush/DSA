class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int res=0;
    
         HashSet<Character> ans=new HashSet<>();


         for(high=0;high<s.length();high++){
            while(ans.contains(s.charAt(high))){
                  ans.remove(s.charAt(low));
                  low++;
                }

                ans.add(s.charAt(high));
                res = Math.max(res, high - low + 1);
         }

         return res;

       
    }
}