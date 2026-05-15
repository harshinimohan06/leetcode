class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         ArrayList<Integer>list=new ArrayList<>();
         int r= matrix.length;
         int c=matrix[0].length;
         
         for(int i=0;i<r;i++){
            int min=matrix[i][0];
            int minc=0;
            for(int j=1;j<c;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    minc=j;
                }
            }
            boolean a=true;
            for(int k=0;k<r;k++){
                if(matrix[k][minc]>min){
                    a=false;
                    break;
                }
            }
            if(a){
                list.add(min);
            }
         }
         return list;
          
        
        
        
    }
}