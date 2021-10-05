class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> countMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if (countMap.get(nums[i]) != null){
                return true;
            }
            countMap.put(nums[i], true);
        }
        return false;
    }
}