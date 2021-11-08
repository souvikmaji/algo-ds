class Solution {
    public int tribonacci(int n) {
        if(n <=1){
            return n;
        }
        if(n == 2){
            return 1;
        }
        
        int[] ans = new int[3];
        ans[1] = 1;
        ans[2] = 1;
        
        int result = ans[2];
        for(int i = 3; i <= n; i++){
            result = ans[0] + ans[1]+ans[2];
            ans[0] = ans[1];
            ans[1] = ans[2];
            ans[2] = result;
        }
        
        return result;
    }
}