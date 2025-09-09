class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for(int i=0;i<t.length();i++){
            if(!(i<s.length())){
                sum2=sum2+t.charAt(t.length()-1);
              break;
            }
            sum1=sum1+s.charAt(i);
            sum2=sum2+t.charAt(i);
        }
        int result =sum2-sum1;
        return (char)result;
        
    }
}