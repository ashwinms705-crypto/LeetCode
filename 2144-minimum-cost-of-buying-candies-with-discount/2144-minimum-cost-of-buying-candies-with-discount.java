class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int l=0;
        int r=cost.length-1;
        while(l<r){
            int temp=cost[l];
            cost[l]=cost[r];
            cost[r]=temp;
            l++;
            r--;
        }
        int ans=0;
        for(int i=0;i<cost.length;i++){
            if((i+1)%3==0) continue;
            ans+=cost[i];
        }
        return ans;
    }
}