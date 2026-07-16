class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] pgcd=new int[n];
        int maxi=nums[0];
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            pgcd[i]=GCD(maxi,nums[i]);
        }
        Arrays.sort(pgcd);
        int a=0;
        int b=n-1;
        long sum=0;
        while(a<b){
            sum+=GCD(pgcd[a],pgcd[b]);
            a++;
            b--;
        }
        return (long)sum;
    }
    public int GCD(int a,int b){
        int maxa=0;
        int maxb=0;
        if(a>b){ maxa=a; 
            maxb=b;
        }
        else{
             maxa=b;
             maxb=a;
        }
        while(maxb!=0){
            int temp=maxb;
            maxb=maxa%maxb;
            maxa=temp;
        }
        return maxa;
    }
}