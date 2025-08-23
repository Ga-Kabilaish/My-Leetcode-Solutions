class Solution {
    public int mySqrt(int x) {
        
    long start=1,end=x,mid=0 ,sq=0,result=0;
         
    if(x==0){
                return 0;
    }
        while(start<=end){
            mid=start+(end-start)/2;
            sq=mid*mid;
            if(sq==x){
                return (int)mid;
            }
            else if(sq<x){
                start=mid+1;
                
            }
            else{
                end=mid-1;
                result=end;
            }
            
        }
        if(x>sq){
            return (int)result;
        }
            
        else{
            return (int)mid-1;
        }
    }}