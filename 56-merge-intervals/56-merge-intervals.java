class Solution {
    public int[][] merge(int[][] intervals) {
        int [][] ans = new int[intervals.length][2];
        Arrays.sort(intervals, Comparator.comparing(arr -> arr[0]));

        int start = intervals[0][0], end = intervals[0][1];
        ans[0] = intervals[0];
        int ansi = 0;
        
        for(int i = 1; i < intervals.length; i++){
            if(ans[ansi][1] >= intervals[i][0]){
                ans[ansi][1] = Math.max(ans[ansi][1], intervals[i][1]) ;
            } else {
                ansi++;
                ans[ansi] = intervals[i];
            }
        }
        return Arrays.copyOfRange(ans,  0, ansi+1);
    }
}