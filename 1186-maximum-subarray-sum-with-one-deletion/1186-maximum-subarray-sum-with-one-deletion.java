class Solution {
    public int maximumSum(int[] arr) {
        int onedlt=Integer.MIN_VALUE ;
        int nodlt=arr[0];
        int ans=arr[0];

        for(int i=1;i<arr.length;i++){
            int prvonedlt=onedlt;
            int prvnodlt=nodlt;


            //case1 when it work as normal kadanes algo means at no dlt

            nodlt=Math.max(arr[i]+nodlt,arr[i]);

            //case2 when one is already dlted or one elemnt that is being dlted is current

            int v;

            if(prvonedlt==Integer.MIN_VALUE ){
                v=arr[i];}

                else{
                    v=prvonedlt+arr[i];}


            onedlt=Math.max(v,prvnodlt); 

            //prvonedlt+a[i]=means one is already dlted   
            //prvnodlt=current is dlted;


            ans=Math.max(ans,Math.max(onedlt,nodlt));
        }

        return ans;

        
    }
}