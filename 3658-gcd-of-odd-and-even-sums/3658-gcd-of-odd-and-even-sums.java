class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sume=0;
        int sumo=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0)
                sume+=i;
            else
                sumo+=i;
        }
        int gcd=1;
        for(int i=2;i<=sume;i++){
            if(sumo%i==0 && sume%i==0){
                gcd=Math.max(gcd,i);
            }
        }
        return gcd;
    }
}