class Solution {
    public void rotate(int[] nums, int k) {
        k =  k  % nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    
    private void reverse(int[] nums, int s, int f) {
        while(s < f){
            swap(nums, s, f);
            s++;
            f--;
        }
    }
    
    private void swap(int[] nums, int s, int f) {
        int temp = nums[s];
        nums[s] = nums[f];
        nums[f] = temp;
    }
}