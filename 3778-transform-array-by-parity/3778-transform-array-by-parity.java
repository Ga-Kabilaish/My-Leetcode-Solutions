class Solution {
    public int[] transformArray(int[] nums){
        
            int[] temp=new int[nums.length];
        for(int i=0,j=nums.length-1;i<nums.length;i++){
            if(nums[i]%2!=0){
                temp[j]=1;
                j--;
            }
        }
        return temp;
    }
}