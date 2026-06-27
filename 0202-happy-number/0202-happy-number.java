class Solution {
    static int add(int n){
        int sum=0;

        while(n>0){
            int digit=n%10;
            n=n/10;

            sum=sum+digit*digit;
        }

        return sum;
    }
    public boolean isHappy(int n) {

        int slow=n;
        int fast=n;

        while(fast!=1){  //coz then true

        slow=add(slow);
        fast=add(fast);
         fast=add(fast);

         if(slow==fast && fast!=1){
            return false;
         }

       


        }
       
       
     return true;
            
        

         
         
    }
}