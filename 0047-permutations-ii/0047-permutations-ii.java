class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] check=new boolean[nums.length];
        perm(nums,check,new ArrayList<>(),res);
        return res;
    }
    public void perm(int[] nums,boolean[] check,List<Integer> l,List<List<Integer>> res){
        if(l.size()==nums.length){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(check[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !check[i-1]) continue;
            l.add(nums[i]);
            check[i]=true;
            perm(nums,check,l,res);
            l.remove(l.size()-1);
            check[i]=false;
        }
    }
}