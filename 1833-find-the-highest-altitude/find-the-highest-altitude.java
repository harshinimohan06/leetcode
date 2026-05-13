class Solution {
    public int largestAltitude(int[] gain) {
       int sum=0;
       int maxAlt=0;
        for(int i:gain){
            sum=sum+i;
            maxAlt = Math.max(maxAlt,sum);
        }
        return maxAlt;
    }
}