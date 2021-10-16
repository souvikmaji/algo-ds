class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        
        while(low < high){
            int mid = (low+high) /2;
            
            // if(mid == low || mid == high){
            //     return mid;
            // }
            
             if(nums[mid] == target) {
                return mid;                
            }
            if(nums[mid] <= target) {
                 low = mid +1;
                
            } else {
               high = mid;
            }  
            
        }
        
        if(nums[high] < target){
            return high +1;
        }
        
        return low;
    }
}