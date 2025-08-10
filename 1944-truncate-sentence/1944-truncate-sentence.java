class Solution {
    public String truncateSentence(String s, int k) {
        
    StringBuilder sb=new StringBuilder();
        
        String[] a=s.split(" ");
        for(String l:a){
            sb.append(l).append(" ");
            k--;
            if(k==0){
                return sb.toString().trim();
            }
        }
        return sb.toString().trim();
        
        
    }}