class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int l=0;
        int num=n;
        while(n>0){
            n=n/10;
            l++;
        }
        return (num-1000)+1;
    }
}