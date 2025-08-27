class Solution {
    public boolean search(int[] nums, int target) {
        
int start=0,end=nums.length-1;
        int mid=0;
        if(nums[start]<nums[end]||nums.length==1){
while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
}
return false;
        }
        if(nums[start]==target){
return true;
        }
        else if(nums[end]==target){
            return true;
        }
        while(nums[start]>target){
            start++;
            if(start==nums.length-1){
                break;
            }
        }
        while(nums[end]<target){
            end--;
            if(end==0){
                break;
            }
        }
        
        
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return false;
    }
}