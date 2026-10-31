class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int y0=coordinates[0][1];
        int x0=coordinates[0][0];
        int y1=coordinates[1][1];
        int x1=coordinates[1][0];

        for(int i=2;i<coordinates.length;i++){
            
            int y2=coordinates[i][1];
            
            int x2=coordinates[i][0];
            if((y2-y1)*(x1-x0)!=(y1-y0)*(x2-x1)) return false;
        }
        return true;
    }
}