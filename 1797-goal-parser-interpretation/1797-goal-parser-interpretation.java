class Solution {
    public String interpret(String command) {
        StringBuffer sb=new StringBuffer();
char[] c=command.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='G'){
                sb.append("G");
            }
            else if(c[i]=='(' & c[i+1]==')'){
                sb.append("o");
                i++;
            }
            else{
                sb.append("al");
                i=i+3;
            }
            
        }
        return sb.toString();
    }
}