class Solution {
    public int maximumPopulation(int[][] logs) {
        int n= logs.length;
        int[]years=new int[2051];
        for(int []log:logs){
            years[log[0]]++;
            years[log[1]]--;
        }
        int max=1950,maxpop=0;
        int pop=0;
        for(int i=1950;i<=2050;i++){
           pop= pop+ years[i];
           if(pop>maxpop){
            maxpop=pop;
            max=i;
           }
        }
        return max;
    }
}