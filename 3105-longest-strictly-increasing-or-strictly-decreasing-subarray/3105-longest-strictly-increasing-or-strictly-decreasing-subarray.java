class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=0;
        int dec=0;
        int n=nums.length;
        
        int count=1;
        int maxi=1;
        int maxd=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                count++;
            }
            else{
                count=1;
            }
            maxi=Math.max(maxi,count);
        }
        count=1;
    
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
            else{
                count=1;
            }
            maxd=Math.max(maxd,count);
        }
        return Math.max(maxd,maxi);
    }
}