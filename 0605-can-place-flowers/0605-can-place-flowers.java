class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int f=flowerbed.length;
        int c=0;
        for(int i=0;i<f;i++){
            if(c==n) return true;
            if(flowerbed[i]==0){
                if((i==0||flowerbed[i-1]==0) && (i==f-1||flowerbed[i+1]==0)){
                    c++;
                    flowerbed[i]=1;
                }
            }
            if(c>=n) return true;
        }
        return false;
    }
}