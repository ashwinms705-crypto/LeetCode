class Solution {
    public int majorityElement(int[] nums) {
        int cand=nums[0];
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(cand==nums[i]){
                c++;
            }
            else if(c==0){
                cand=nums[i];
            }
            else{
                c--;
            }
        }
        return cand;
    }
}