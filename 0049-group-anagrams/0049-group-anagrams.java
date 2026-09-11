class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String t=new String(c);
            if(hm.containsKey(t)){
                hm.get(t).add(s);
            }
            else{
                hm.put(t,new ArrayList<>());
                hm.get(t).add(s);
            }
        }
        return new ArrayList<>(hm.values());
    }
}