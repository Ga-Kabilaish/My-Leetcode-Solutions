class Solution {
    public int[] plusOne(int[] digits) {
        
    for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1 != 10){
                digits[i]=digits[i]+1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] array=new int[digits.length+1];
            array[0]=1;
            for(int i=1;i<digits.length;i++){
                array[i]=digits[i-1];
            }
            return array;
        }
        return new int[]{};
    }
}