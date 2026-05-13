class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean>a=new ArrayList<>();
        int max=0;
        for(int b:candies){
            
           max=Math.max(max,b);
        }
           for(int b:candies){
            a.add(b+extraCandies>=max);
           
        }
        return a;
    }
}