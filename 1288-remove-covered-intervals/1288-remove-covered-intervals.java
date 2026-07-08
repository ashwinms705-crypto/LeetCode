class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])
                return Integer.compare(b[1],a[1]);
            return Integer.compare(a[0],b[0]);
        });
        int prev[]=intervals[0];
        int c=intervals.length;
        for(int i=1;i<intervals.length;i++){
            if(prev[0]<=intervals[i][0] && intervals[i][1]<=prev[1]){
                c--;
            }
            else{
                prev=intervals[i];
            }
        }
        return c;
    }
}