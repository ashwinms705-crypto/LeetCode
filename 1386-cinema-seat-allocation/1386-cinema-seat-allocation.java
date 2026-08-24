class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {
        Arrays.sort(r,(a,b)->{
            if(a[0]==b[0])
                return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });
    
        HashMap<Integer,HashSet<Integer>> hm=new HashMap<>();
        for(int[] i:r){
            hm.putIfAbsent(i[0],new HashSet<>());
            hm.get(i[0]).add(i[1]);
        }
        int ans=(n-hm.size())*2;
        for(int i:hm.keySet()){
            boolean ri=true;
            boolean l=true;
            boolean m=true;
            for(int j=2;j<=5;j++){
                if(hm.get(i).contains(j)){
                    l=false;
                    break;
                }
            }
            for(int j=4;j<=7;j++){
                if(hm.get(i).contains(j)){
                    m=false;
                    break;
                }
            }
            for(int j=6;j<=9;j++){
                if(hm.get(i).contains(j)){
                    ri=false;
                    break;
                }
            }
            if(l&&ri)
                ans+=2;
            else if(ri||l||m)
                ans+=1;
        }
        return ans;
    }
}