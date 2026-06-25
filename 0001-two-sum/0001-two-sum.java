class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(hm.containsKey(k)){
                res=new int[]{i,hm.get(k)};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}