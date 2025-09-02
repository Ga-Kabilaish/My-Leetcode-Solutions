class Solution {
    public int findPeakElement(int[] nums) {
        
    int start=0,end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(mid<end&&(nums[mid]<nums[mid+1])){
                start=mid+1;
            }
            else if(mid>start&&nums[mid]<nums[mid-1]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return mid;
        
    }}
        