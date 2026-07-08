class Solution {
    public long sumAndMultiply(int n) {
        int num=n;
        long x=0;
        long sum=0;
        int mul=1;
        while(num>0){
            if(num%10!=0){
                x+=((num%10)*mul);
                mul=mul*10;
                sum+=(num%10);
            }
            num=num/10;
        }
        return x*sum;
    }
}