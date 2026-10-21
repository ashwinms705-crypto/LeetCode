class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> hm=new HashMap<>();
        int n=s.length();
        for(int i=0;i<=n-10;i++){
            String st=s.substring(i,i+10);
            if(hm.containsKey(st))
                hm.put(st,hm.getOrDefault(st,0)+1);
            else
                hm.put(st,1);
        }
        List<String> ans=new ArrayList<>();
        for(String i:hm.keySet()){
            if(hm.get(i)>1) ans.add(i);

        }
        return ans;
    }
}