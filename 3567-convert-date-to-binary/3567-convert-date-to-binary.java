class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb=new StringBuilder(date);
String y =Integer.toBinaryString(Integer.parseInt(sb.substring(0,4)));
String m=Integer.toBinaryString(Integer.parseInt(sb.substring(5,7)));
String d =Integer.toBinaryString(Integer.parseInt(sb.substring(8,10)));

sb.replace(8,10,d).replace(5,7,m).replace(0,4,y);
return sb.toString();

    }
}