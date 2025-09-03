class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    int ans=findRow(target,matrix);
if(ans==-1){
    return false;
}
        boolean b=binarySearch(target,matrix[ans]);
        return b;
    }
        
        int findRow(int target,int[][] m){
            for(int i=0;i<m.length;i++){
                int l=m[i].length-1;
                if(m[i][l]>target){
                    return i;
                }
                else if(m[i][l]==target){
return i;
                }
               
        
            }
            return -1;
            
            
        }
        boolean binarySearch(int target,int[] m){
            int start=0;
            int end=m.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(m[mid]==target){
                    return true;
                }
                else if(m[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                
                
            }
            return false;
            
        }
    
}