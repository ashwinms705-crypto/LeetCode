class Solution {
    public int numberOfSubstrings(String s) {
        int start=0;
        int end=0;
        int count=0;
        int n=s.length();
        int a=0;int b=0;int c=0;
        while(end<n){
            char ch=s.charAt(end);
            if(ch=='a') a++;
            else if(ch=='b') b++;
            else
                c++;
            while(a>0 && b>0 && c>0){
                count+=(n-end);
                char l=s.charAt(start);
                if(l=='a') a--;
                else if(l=='b') b--;
                else c--;
                start++;
            }
            end++;
        }
        return count;
    }
}