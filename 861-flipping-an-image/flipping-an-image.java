class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
    int n= image.length;
       
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=image[i][l];
                image[i][l]=image[i][r];
                image[i][r]=temp;
                l++;
                r--;
            }
        }
     
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1;  
                }
        }
        return image;


    }
}