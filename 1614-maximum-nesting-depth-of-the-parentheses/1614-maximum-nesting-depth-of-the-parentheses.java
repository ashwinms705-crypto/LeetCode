class Solution {
    public int maxDepth(String s) {
        int ans=Integer.MIN_VALUE;
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }
            else if(c==')'){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}