class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0) return new ArrayList<>();
        int start=nums[0];
        int end=nums[0];
        List<String> l=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                if(start==end)
                    l.add(Integer.toString(start));
                else
                    l.add(Integer.toString(start)+"->"+Integer.toString(end));
                start=nums[i];
                end=nums[i];
            }
            else{
                end++;
            }
        }
        if(start==end)
            l.add(Integer.toString(start));
        else
            l.add(Integer.toString(start)+"->"+Integer.toString(end));
        return l;
    }
}