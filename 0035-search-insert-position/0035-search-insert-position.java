class Solution {
    public int searchInsert(int[] nums, int target) {
    int start=0,end=nums.length-1,mid=0;
        int result=-1;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
                result=mid+1;
                
            
            }
            else{
            end=mid-1;
            result=mid;
                
            }
        }
        return result;

    }
}