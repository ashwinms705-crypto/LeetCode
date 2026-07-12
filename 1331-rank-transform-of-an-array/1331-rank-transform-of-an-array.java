class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,List<Integer>> tm=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            if(tm.containsKey(arr[i])){
                tm.get(arr[i]).add(i);
            }
            else{
                tm.put(arr[i],new ArrayList<>());
                tm.get(arr[i]).add(i);
            }
        }
        int r=1;
        int res[]=new int[arr.length];
        for(int i:tm.keySet()){
            List<Integer> l=tm.get(i);
            for(int k:l){
                res[k]=r;
            }
            r++;
        }
        return res;
    }
}