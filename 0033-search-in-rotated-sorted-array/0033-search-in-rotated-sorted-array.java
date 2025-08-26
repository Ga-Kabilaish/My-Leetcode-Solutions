class Solution {
    public int search(int[] nums, int target) {
        
    int start=0,end=nums.length-1;
        int mid=0;
        if(nums[start]<=nums[end]){
while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
}
return -1;
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
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return -1;
    }
}