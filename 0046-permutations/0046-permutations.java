class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        perm(nums,new ArrayList<>(),res);
        return res;
    }
    static void perm(int[] nums,List<Integer> l,List<List<Integer>> res){
        if(l.size()==nums.length){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i:nums){
            if(l.contains(i)) continue;
            l.add(i);
            perm(nums,l,res);
            l.remove(l.size()-1);
        }
    }
}