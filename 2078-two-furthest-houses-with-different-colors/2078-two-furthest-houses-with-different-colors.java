class Solution {
    public int maxDistance(int[] color) {
        int l=0;
        
        for(int i=0;i<color.length;i++){
            if(color[i]!=color[color.length-1]){
                l=Math.max(l,color.length-1-i);
                break;
            }
        }
        for(int i=color.length-1;i>=0;i--){
            if(color[i]!=color[0]){
                l=Math.max(l,i);
                break;
            }
            
        }
        return l;
    }
}