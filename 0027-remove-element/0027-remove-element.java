class Solution {
    public int removeElement(int[] nums, int val) {
        int count=nums.length,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
            else{
                count--;
            }
        }
        return count;
    }
}