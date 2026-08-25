class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int n=nums.length;
        int mul=k;
        for(int i=1;i<=n;i++){
            mul=k*i;
            if(!hs.contains(mul))
                return mul;
        }
        if(mul==(n*k))
            mul=(n+1)*k;
        return mul;
    }
}