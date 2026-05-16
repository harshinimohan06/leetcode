
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>a=new ArrayList<>();
        int sum=0, carry=k;
        for(int i=num.length-1;i>=0;i--){
            carry=carry+num[i];
            a.add(carry%10);
            carry/=10;
        }
        while (carry > 0) {
            a.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(a);
        return a;
        


        
     
    }
}