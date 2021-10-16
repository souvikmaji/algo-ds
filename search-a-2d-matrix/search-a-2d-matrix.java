class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;
        int row = 0;
         
        while(low <= high){
           int mid = (low+high)/2;
            
           if(target < matrix[mid][0]){
               high = mid - 1;     
           } else {
                low = mid+1;
           }    
        }
        
        row = low-1;
        if(row < 0){
            return false;
        }
        
        low = 0;
        high = matrix[row].length - 1;
          
        while(high >= low){
            int mid = (high+low)/2;
            if(target == matrix[row][mid]){
                return true;
            }
            
            if(target < matrix[row][mid]){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return false;
    }
}