class Solution {
    public int[] leftRightDifference(int[] nums) {
        int r=0;
        for(int i:nums){
            r+=i;
        }
        int l=0;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            r-=nums[i];
            res[i]=Math.abs(r-l);
            l+=nums[i];
        }
        return res; 
    }
}