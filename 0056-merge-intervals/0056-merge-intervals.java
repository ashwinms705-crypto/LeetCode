class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> arr=new ArrayList<>();
        int[] prev=intervals[0];
        if(intervals.length==1) return intervals;
        for(int i=1;i<intervals.length;i++){
            if(prev[1]>=intervals[i][0]){
                int start=prev[0];
                int end=Math.max(prev[1],intervals[i][1]);
                prev=new int[]{start,end};
            }
            else{
                arr.add(prev);
                prev=intervals[i];
            }
        }
        arr.add(prev);
        int res[][]=new int[arr.size()][2];
        int i=0;
        for(int[] a:arr){
            res[i]=a;
            i++;
        }
        return res;
    }
}