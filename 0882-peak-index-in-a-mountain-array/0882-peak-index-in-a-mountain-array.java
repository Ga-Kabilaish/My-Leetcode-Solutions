class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
    int start=0,end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(mid>start&&arr[mid]<arr[mid-1]){
                end=mid-1;
            }
            else if(mid<end&&arr[mid]<arr[mid+1]){
            start=mid+1;
            }
            
            else{
                return mid;
            }
            
        }
        return -1;
    }
}