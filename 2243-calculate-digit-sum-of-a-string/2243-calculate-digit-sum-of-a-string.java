class Solution {
    public int dig(String st){
        int sum=0;
        for(int i=0;i<st.length();i++){
            sum+=st.charAt(i)-'0';
        }
        return sum;
    }
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>k){
            StringBuilder t=new StringBuilder();
            for(int i=0;i<sb.length();i+=k){
                int n;
                if(i+k>sb.length()){
                    t.append(dig(sb.substring(i)));
                }
                else{
                    t.append(dig(sb.substring(i,i+k)));
                }

            }
            sb=new StringBuilder(t);
        }
        return sb.toString();
    }
}