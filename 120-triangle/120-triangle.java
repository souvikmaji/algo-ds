class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        for(int i = 1; i < triangle.size(); i++){
            int n =  triangle.get(i).size();
          
            triangle.get(i).set(0, triangle.get(i).get(0) + triangle.get(i-1).get(0));
            for(int j = 1; j < n-1; j++){
                int curr = triangle.get(i).get(j);
                int prev = Math.min(triangle.get(i-1).get(j), triangle.get(i-1).get(j-1));
                triangle.get(i).set(j, curr+prev);
            }
             triangle.get(i).set(n-1, triangle.get(i).get(n-1) + triangle.get(i-1).get(n-2));
        }
        
        int lastRow = triangle.size()-1;
        int min = triangle.get(lastRow).get(0);
        for(int i = 1; i < triangle.get(lastRow).size();i++){
            min = Math.min(min, triangle.get(lastRow).get(i));
        }
        
        return min;
    }
}

/*
   2
  5 6
 11 10 7
4 1 8 3

i = 2
n = 3
j = 1
curr = 5
prev = 5
*/