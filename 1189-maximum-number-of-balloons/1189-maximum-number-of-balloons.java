class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:text.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int b=hm.getOrDefault('b',0);
        int a=hm.getOrDefault('a',0);
        int n=hm.getOrDefault('n',0);
        int l=hm.getOrDefault('l',0);
        int o=hm.getOrDefault('o',0);
        return Math.min(Math.min(b,Math.min(a,n)),Math.min(o/2,l/2));

    }
}