class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            String s=String.valueOf(i);
            for(char c:s.toCharArray()){
                l.add(c-'0');
            }
        }
        int[] ans=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}