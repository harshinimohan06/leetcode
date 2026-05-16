class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        

        int count=0;
        for(int j=0;j< items.size();j++){
           

            
            if((ruleKey.equals("type") && items.get(j).get(0).equals(ruleValue) )|| (ruleKey.equals("color") && items.get(j).get(1).equals(ruleValue) )||(ruleKey.equals("name") && items.get(j).get(2).equals(ruleValue))){
                count++;

            }
            
            
        }
        return count;

    }
}
