class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int res[]=new int[arr.length];
        /*TreeMap<Integer,List<Integer>> tm=new TreeMap<>();
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
        }*/
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int r=1;
        for(int i=0;i<temp.length;i++){
            if(!hm.containsKey(temp[i])){
                hm.put(temp[i],r++);
            }
            else{
                continue;
            }
        }
        for(int i=0;i<arr.length;i++){
            res[i]=hm.get(arr[i]);
        }
        return res;
    }
}