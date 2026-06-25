class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dpa=new int[m][n];
        for(int[] i:dpa){
            Arrays.fill(i,-1);
        }
        return dp(m,n,0,0,dpa);
    }
    public int dp(int m,int n,int i,int j,int[][] dpa){
        if(i>=m || j>=n)
            return 0;
        if(i==m-1 && j==n-1)
            return 1;
        if(dpa[i][j]!=-1)
            return dpa[i][j];
        else
           return dpa[i][j]=dp(m,n,i+1,j,dpa)+dp(m,n,i,j+1,dpa);       
    }
}