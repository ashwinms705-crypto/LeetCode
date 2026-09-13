class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxi=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        int mini[]=new int[nums.length];
        int ans=Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            mi=Math.min(mi,nums[i]);
            mini[i]=mi;
        }
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
            if(maxi-mini[i]<=k) ans=Math.min(ans,i);
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}