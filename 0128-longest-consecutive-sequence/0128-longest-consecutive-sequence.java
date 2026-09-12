class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int c=1;
        int maxi=Integer.MIN_VALUE;
        for(int i:hs){
            if(!hs.contains(i-1)){
                int cur=i;
            while(hs.contains(cur+1)){
                cur++;
                c++;
            }
            maxi=Math.max(maxi,c);
            c=1;

            }
        }
        return maxi;
    }
}