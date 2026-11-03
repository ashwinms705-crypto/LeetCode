class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=n/2;
        int med=nums[m];
        int ans=0;
        for(int i=0;i<m;i++){
            ans+=med-nums[i];
        }
        for(int i=m;i<n;i++){
            ans+=nums[i]-med;
        }
        return ans;
    }
}