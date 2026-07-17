class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int k=0;
        for(int i:hm.keySet()){
            int l=hm.get(i);
            if(l>=2){
                nums[k]=i;
                k++;
                nums[k]=i;
                k++;
            }
            else{
                nums[k]=i;
                k++;
            }
        }
        return k;
    }
}