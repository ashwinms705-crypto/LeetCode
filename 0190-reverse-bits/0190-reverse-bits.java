class Solution {
    public int reverseBits(int n) {
        String s=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        int ans=(int) Long.parseLong(sb.toString(),2);

        return ans;
    }
}