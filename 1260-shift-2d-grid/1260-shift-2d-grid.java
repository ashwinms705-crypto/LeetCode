class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        Integer[][] res=new Integer[n][m];
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int ind=i*m+j;
                int newind=(ind+k)%(m*n);
                int r=newind/m;
                int c=newind%m;
                res[r][c]=grid[i][j];
            }
        }
        for(Integer[] arr:res){
            ans.add(Arrays.asList(arr));
        }
        return ans;
    }
}