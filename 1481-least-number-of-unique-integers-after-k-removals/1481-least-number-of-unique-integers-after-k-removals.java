class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:hm.keySet()){
            l.add(hm.get(i));
        }
        Collections.sort(l);
        int j=k;
        int c=0;
        for(int i:l){
            if(j<=0) break;
            if(i<=j){
                c++;
                j=j-i;
            }
        }
        return hm.size()-c;
    }
}