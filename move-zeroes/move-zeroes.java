class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0, j = 0;
        
        while(i < nums.length && j < nums.length){
            while(i < nums.length && nums[i] == 0){
                i++;
            }
            
            while(j < nums.length && nums[j] != 0){
                j++;
            }
            
            if(i < nums.length && j < nums.length && i > j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else{
                i++;
            }
           }
        
    }
}
//      i
// [1,0,1]
//    j