class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int nums1[]=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums1);
        int s=0;
        int l=nums.length-1;
        while(s<l){
            int temp=nums1[s];
            nums1[s]=nums1[l];
            nums1[l]=temp;
            s++;
            l--;
        }
        long ans=0;
        
        int lim=(n+1)/2;
        for(int i=0;i<lim;i++){
            ans+=(long)nums1[i]*nums1[i];
        }
        for(int i=lim;i<n;i++){
            ans-=(long)nums1[i]*nums1[i];
        }
        return ans;
    }
}