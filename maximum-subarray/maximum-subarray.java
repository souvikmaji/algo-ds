class Solution {
    public int maxSubArray(int[] nums) {
      
        int currentSum = nums[0], maxSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] + currentSum > nums[i]){
                currentSum += nums[i];
            } else {
             
              currentSum = nums[i];  
            }

            maxSum = Math.max(maxSum, currentSum);
            
        }
        
        return maxSum;
    }
}