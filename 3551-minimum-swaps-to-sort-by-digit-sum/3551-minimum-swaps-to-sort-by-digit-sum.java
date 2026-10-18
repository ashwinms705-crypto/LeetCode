class Solution {
    public int minSwaps(int[] nums) {
        ArrayList<int[]> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            l.add(new int[]{nums[i],sum,i});
        }
        Collections.sort(l,(a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int ans=0;
        boolean arr[]=new boolean[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(arr[i]||i==l.get(i)[2]) continue;
            int k=i;
            int c=0;
            while(!arr[k]){
                arr[k]=true;
                k=l.get(k)[2];
                c++;
            }
            ans+=c-1;
        }
        
        return ans;
    }
}