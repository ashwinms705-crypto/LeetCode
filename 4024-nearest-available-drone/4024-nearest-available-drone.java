class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n=drones.length;
        ArrayList<int []> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int d=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(d<=drones[i][2]){
                l.add(new int[]{i,d});
            }
        }
        l.sort((a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        if(l.size()==0) return -1;
        return l.get(0)[0];
    }
}