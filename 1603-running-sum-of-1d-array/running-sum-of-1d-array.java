class Solution {
    public int[] runningSum(int[] nums) {
        int[]r=new int[nums.length];
        int i=1;
        r[0]=nums[0];
       while(i<nums.length){
        int x=r[i-1];
        r[i]=x+nums[i];
        i++;
       }
       
       return r;

    }
}