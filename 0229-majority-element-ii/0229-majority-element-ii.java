class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int c1=0;
         int c2=0;
         int e1=0;
         int e2=0;
         int n=nums.length;
         for(int i:nums){
            if(i==e1){
                c1++;
            }
            else if(i==e2){
                c2++;
            }
            else if(c1==0){
                c1=1;
                e1=i;
            }
            else if(c2==0){
                c2=1;
                e2=i;
            }
            else{
                c2--;
                c1--;
            }
         }
         c1=0;c2=0;
         for(int i:nums){
            if(i==e1) c1++;
            else if(i==e2) c2++;
         }
         List<Integer> l=new ArrayList<>();
         if(c1>(n/3)) l.add(e1);
         if(c2>(n/3)) l.add(e2);
         return l;
    }
}