class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0, j = nums.length - 1;
        
        for(int k = nums.length - 1; k >= 0 ;k --){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                res[k] = (int)Math.pow(nums[i], 2);
                i++;
            } else {
                res[k] = (int) Math.pow(nums[j], 2);
                j--;
            }
        }
        
        return res;        
    }
}

