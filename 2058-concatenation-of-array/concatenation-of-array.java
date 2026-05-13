class Solution {
    public int[] getConcatenation(int[] nums) {
        int s= 2*(nums.length);
        int[]ans=new int[s];
        
        for(int i=0;i<s;i++){
            if(i<nums.length){
                ans[i]=nums[i];

            }
        }
        for(int i=nums.length;i<s;i++){
            if(i<s){
                ans[i]=nums[i-nums.length];
            }
        }
            
            
            
        
        return ans;
            
        }
    }