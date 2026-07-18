class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s=nums[0];
        int l=nums[nums.length-1];
        while(s!=0){
            int temp=s;
            s=l%s;
            l=temp;
        }
        return l;
    }
}