class Solution {
    public int calculateScore(int a, int b) {
        int n1=Integer.bitCount(a);
        int n2=Integer.bitCount(b);
        if(n1>=n2) return n1*n2;
        return n2/n1;
    }
}