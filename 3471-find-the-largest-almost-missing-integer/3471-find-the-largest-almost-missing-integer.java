class Solution {
    public int largestInteger(int[] nums, int k) {
        int i=0;
        int j=k-1;
        int n=nums.length;
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(j<n){
            int p=i;
            HashSet<Integer> hs=new HashSet<>();
            while(p<=j ){
                if(!hs.contains(nums[p])){
                    hs.add(nums[p]);
                    hm.put(nums[p],hm.getOrDefault(nums[p],0)+1);
                }
                p++;
            }
            i++;
            j++;
        }
        int ans=-1;
        for(int v:hm.keySet()){
            if(hm.get(v)==1)
                ans=Math.max(ans,v);
        }
        return ans;
    }
}