class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
     
        triangle.add(List.of(1));
        
        for(int i = 1; i < numRows; i++){
            List<Integer> nums = new ArrayList<>();
            List<Integer> lastRow = triangle.get(i-1);
            
            nums.add(lastRow.get(0));
            for(int j = 1; j < i; j++){
                nums.add(lastRow.get(j)+lastRow.get(j-1));
            }
            nums.add(lastRow.get(lastRow.size()-1));
            
            triangle.add(nums);        
        }
        return triangle;
    }
}