class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str=s.substring(i,j+1);
                int l=0;
                int h=str.length()-1;
                while(l<h){
                    if(str.charAt(l)!=str.charAt(h))
                        break;
                    l++;
                    h--;
                }
                if(l>=h && str.length()>res.length()){
                    res=new String(str);
                }
            }
        }
        return res;
    }
}