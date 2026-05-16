class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][]x=new int[m][n];
        for(int k=0;k<indices.length;k++){
            int r=indices[k][0];
            int c= indices[k][1];
            for(int i=0;i<n;i++){
                x[r][i]++;
            }
            for(int j=0;j<m;j++){
                x[j][c]++;
            }

        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
        
      
    }
}