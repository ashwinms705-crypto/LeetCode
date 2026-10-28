class Solution {
    public int mySqrt(int x) {
        int i=1;
        int j=x/2;
        int ans=0;
        if(x==1) return 1;
        while(i<=j){
            int mid=i+(j-i)/2;
            
            if(mid==x/mid) return mid;
            else if(mid>x/mid){
                j=mid-1;
            }
            else{
                i=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}