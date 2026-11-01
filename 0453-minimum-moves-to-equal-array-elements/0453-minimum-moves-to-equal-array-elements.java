class Solution {
    public int minMoves(int[] nums) {
        int small=Integer.MAX_VALUE;
        for(int i:nums){
            small=Math.min(small,i);
        }
        int ans=0;
        for(int i:nums){
            ans+=i-small;
        }
        return ans;
    }
}