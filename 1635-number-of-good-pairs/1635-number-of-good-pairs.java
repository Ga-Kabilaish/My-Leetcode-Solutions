class Solution {
    public int numIdenticalPairs(int[] nums) {
        
    int i=0,j=i+1,count=0;
    Arrays.sort(nums);
        if(nums.length==1){
            return 0;
        }
        while(i<nums.length-1){
            if(nums[i]==nums[j]){
                j++;
                count++;
            }
            if(j>nums.length-1 || nums[i]!=nums[j]){
                i++;
                j=i+1;
            }
        }
        return count;
    }
}