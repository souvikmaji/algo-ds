public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        int bit = 31;
        while(bit >= 0){
            ans ^= (n & 1) << bit;
            n = n >> 1;
            bit --;
        }
        
        return ans;
    }
}