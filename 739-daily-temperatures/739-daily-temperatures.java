class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] ans = new int[temps.length];
        
        Stack<Integer> s = new Stack<>();
        s.push(0);
        
        for(int i = 1; i < temps.length; i++){
            int curr = temps[i];
            
            while(!s.empty() && curr > temps[s.peek()]){
                int lastIndex = s.pop();
                ans[lastIndex] = i-lastIndex;
            }      
            s.add(i);
        }
        
        return ans;
    }
}

// 75

