class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
                for(int j=i+1;j<nums.length;j++){
                    if(j>i+1 && nums[j]==nums[j-1])
                        continue;
                        int l=j+1;
                        int r=nums.length-1;
                        while(l<r){
                            long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                            if(sum==target){
                                List<Integer> li=new ArrayList<>();
                                li.add(nums[i]);li.add(nums[j]);li.add(nums[l]);li.add(nums[r]);
                                res.add(li);
                                l++;
                                r--;
                                while(l<r && nums[l]==nums[l-1]) l++;
                                while(l<r && nums[r]==nums[r+1]) r--;
                            }
                            else if(sum<target){
                                l++;
                            }
                            else{
                                r--;
                            }
                        }
                }
        }
        return res;
    }
}