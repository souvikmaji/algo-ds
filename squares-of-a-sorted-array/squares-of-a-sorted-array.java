class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        
        int lastNeg = 0;
        while(lastNeg < nums.length && nums[lastNeg] < 0){
            lastNeg++;
        }
        
        int firstPos = lastNeg;
        lastNeg--;
        
        int k = 0;
        while(lastNeg >= 0 && firstPos < nums.length) {
            int x = (int)Math.pow(nums[lastNeg], 2);
            int y = (int)Math.pow(nums[firstPos], 2);
            
            if(x < y){
                res[k++] = x;
                lastNeg --;
            }else {
                res[k++] = y;
                firstPos ++;
            }
        }
        
        while(lastNeg >= 0){
            res[k++] = (int)Math.pow(nums[lastNeg--], 2);;
        }
        
        while(firstPos < nums.length){
            res[k++] = (int)Math.pow(nums[firstPos++], 2);;
        }
        
        return res;        
    }
}

