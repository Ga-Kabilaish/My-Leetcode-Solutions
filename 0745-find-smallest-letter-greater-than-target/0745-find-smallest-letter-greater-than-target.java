class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
int start=0,end=letters.length-1,mid=0;
      if(target>=letters[end]){
          return letters[0];
      }
      while(start<=end){
          mid=(start+end)/2;
          if(letters[mid]==target){
    for(int i=mid;i<letters.length;i++){
                  if(letters[i]!=target){
                      return letters[i];
                  }
              }
          }
          else if(letters[mid]<target){
              start=mid+1;
          }
          else{
              end=mid-1;
          }
          
          
      }
      return letters[start];
    }}