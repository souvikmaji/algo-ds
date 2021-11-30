class Solution {
    
    public void backtrack(LinkedList<Integer> curr, int start, int n, int k, List<List<Integer>> res){
        
        
        for(int i = start; i <= n; i++){
            curr.add(i);
            
            if(curr.size() == k){
                res.add(new ArrayList(curr));
                //return;
            }
            
            backtrack(curr, i+1, n, k, res);
            curr.removeLast();
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res =  new ArrayList<>();
        backtrack(new LinkedList<>(), 1, n, k,res);
        return res;
        
    }
}