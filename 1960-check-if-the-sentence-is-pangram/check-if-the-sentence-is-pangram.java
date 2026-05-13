
class Solution {
    public boolean checkIfPangram(String sentence) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < a.length(); i++) {
            if (sentence.indexOf(a.charAt(i)) == -1) {
                return false; 
            }
        }
        return true;
    }
}
