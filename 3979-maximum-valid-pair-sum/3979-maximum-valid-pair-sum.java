class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxi=0;
        int r=0;
        for(int i=k;i<nums.length;i++){
            r=Math.max(r,nums[i-k]);
            maxi=Math.max(maxi,nums[i]+r);
        }
        return maxi;
    }
}