class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>(9*num)||sum==0 && num>1) return "";
        char c[]=new char[num];
        int n=0;
        for(int i=0;i<num;i++){
            int k=sum-n;
            if(k>9){
                c[i]=(char)(9+'0');
                n+=9;
            }
            else{
                c[i]=(char)(k+'0');
                n+=k;
            }
        }
        String ans=new String(c);
        return ans;
    }
}