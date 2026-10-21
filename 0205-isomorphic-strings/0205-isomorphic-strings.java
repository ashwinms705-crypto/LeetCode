class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if((hm.containsKey(a) && hm.get(a)!=b)||(!hm.containsKey(a) && hm.containsValue(b))) return false;
            hm.put(a,b);
        }
        return true;
    }
}