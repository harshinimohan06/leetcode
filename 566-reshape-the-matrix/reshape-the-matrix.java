class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int m=mat.length;
         int n=mat[0].length;
         int row=0,col=0;
        int[][]x= new int[r][c];
     
           
            
            if(r*c!=m*n){
                return mat;
            }
            else{
                for(int j=0;j<m;j++){
                    for(int k=0;k<n;k++){
                        x[row][col]=mat[j][k];
                        col++;
                        if(col==c){
                            col=0;
                            row++;
                        }
                    }
                }
            }


        
        return x;
        
        
    }
}