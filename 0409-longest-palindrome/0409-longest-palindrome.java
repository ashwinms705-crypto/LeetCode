class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int ans=0;
        boolean f=false;
        for(char c:hm.keySet()){
            if(hm.get(c)%2==0){
                ans=ans+hm.get(c);
            }
            else{
                f=true;
                ans=ans+(hm.get(c)-1);
            }
        }
        if(f) ans=ans+1;
        return ans;
    }
}