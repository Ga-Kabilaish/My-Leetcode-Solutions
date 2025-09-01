class Solution {
    public int findMin(int[] nums) {
        
        int start=0,end=nums.length-1,mid=0,e=nums.length-1;
        if(nums[start]<nums[end]){
            return nums[start];
        }
        while(start<=end){
            mid=(start+end)/2;
            
            if(nums[mid]>nums[e]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return nums[start];
    }}