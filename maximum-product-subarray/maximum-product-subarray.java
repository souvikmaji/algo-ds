class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int finalProd = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            
            minProd = Math.min(nums[i], minProd*nums[i]);
            maxProd = Math.max(nums[i], maxProd*nums[i]);
            
            finalProd = Math.max(finalProd, maxProd);
        }
        
        return finalProd;
    }
}