class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;
       int[] result={-1,-1};
           int mid=0;
       
       while(start<=end){
           mid=(start+end)/2;
           if(nums[mid]==target){
               end=mid-1;
               result[0]=mid;
           }
           else if(target>nums[mid]){
               start=mid+1;
               
           }
           else{
               end=mid-1;
           }
       }
       start=mid;
    end=nums.length-1;
       while(start<=end){
           mid=(start+end)/2;
           if(nums[mid]==target){
               start=mid+1;
               result[1]=mid;
           }
           else if(target<nums[mid]){
               end=mid-1;
               
           }
           else{
               start=mid+1;
           }
       }
       
       return result;
        
    }}
       
       
       