class Solution {
    private void combinationSum(int[] candidates, int start, int target, List<Integer> curr,  List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList(curr));
        }
        
        if(target < 0){
            return;
        }
        
        for(int i = start; i < candidates.length; i++){
            curr.add(candidates[i]);
            combinationSum(candidates, i, target - candidates[i], curr, ans);
            curr.remove(curr.size() - 1);
        }
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(candidates,0, target, new ArrayList<>(), ans);
        return ans;
    }
}