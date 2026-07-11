class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[][] arr=new int[hm.size()][2];
        int j=0;
        for(int i:hm.keySet()){
            arr[j][0]=i;
            arr[j][1]=hm.get(i);
            j++;
        }
        int[] res=new int[k];
        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
        for(int i=0;i<k;i++){
            res[i]=arr[i][0];
        }
        return res;
    }
}