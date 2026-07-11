class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        int num=n;
        return (num-1000)+1;
    }
}