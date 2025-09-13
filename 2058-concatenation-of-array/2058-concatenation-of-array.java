class Solution {
    public int[] getConcatenation(int[] nums){
        int[] array=new int[nums.length*2];
        int length=nums.length;
        for(int i=0;i<nums.length;i++){
            array[i]=nums[i];
            array[i+length]=nums[i];
            
        }
        return array;
        
    }
}