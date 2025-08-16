class Solution {
    public int lengthOfLongestSubstring(String s) {
        
    int max=0,j=0,i=0;
        String[] a=s.split("");
        while(j<=s.length()){
            if(j==s.length()){
                max=Math.max(j-i,max);
                j++;
            }
            else if(!(s.substring(i,j).contains(a[j]))){
                j++;
            }
            else{
                max=Math.max(j-i,max);
                i++;
            }
        }
        return max;
    }
}