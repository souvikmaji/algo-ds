class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        
        for(int i = 0, j = height.length - 1; i < j;) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            
            if(height[i] < height[j]){
                i++;
            } else{
                j--;
            }
        }     
        
        return maxArea;
    }
}
    
    