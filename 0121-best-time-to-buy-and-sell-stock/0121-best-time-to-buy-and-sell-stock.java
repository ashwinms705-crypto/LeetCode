class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int p=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            p=Math.max(p,prices[i]-buy);
        }
        return p;
    }
}