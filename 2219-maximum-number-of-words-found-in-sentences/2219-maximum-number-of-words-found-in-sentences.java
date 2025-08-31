class Solution {
    public int mostWordsFound(String[] sentences) {
        
    int m=0;
        for(String a:sentences){
            int max=a.split(" ").length;
            if(max>m){
                m=max;
            }
        }
       return m;
    }}