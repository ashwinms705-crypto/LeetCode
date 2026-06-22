class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(char c:s.toCharArray()){
            hm1.put(c,hm1.getOrDefault(c,0)+1);
        }
        for(char c:target.toCharArray()){
            hm2.put(c,hm2.getOrDefault(c,0)+1);
        }
        int mini=Integer.MAX_VALUE;
        for(char c:target.toCharArray()){
            int n1=hm2.getOrDefault(c,0);
            int n2=hm1.getOrDefault(c,0);
            mini=Math.min(mini,n2/n1);
        }
        return mini;
    }
}