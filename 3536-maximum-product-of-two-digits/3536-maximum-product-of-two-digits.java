class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        char[] c=s.toCharArray();
        Arrays.sort(c);
        int a=c[c.length-1]-'0';
        int b=c[c.length-2]-'0';
        return a*b;
    }
}