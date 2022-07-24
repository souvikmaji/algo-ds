class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length, col = grid[0].length;
        int count = 0;
        int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1} , {0, 1}};
        
        for(int i = 0 ; i < row; i ++){
            for(int j = 0 ; j < col; j ++){
                if(grid[i][j] == '1'){
                    // System.out.println(i + " " + j);
                    count ++;
                    
                    Queue<Coordinate> q = new ArrayDeque<>();    
                    q.offer(new Coordinate(i, j));
                    
                    while(!q.isEmpty()){
                        Coordinate c =  q.remove();
                        grid[c.i][c.j] = '0';
                        
                        for(int[] d: directions){
                            int nextI = c.i + d[0];
                            int nextJ = c.j + d[1];

                            if(isValid(nextI, nextJ, row, col) && grid[nextI][nextJ] == '1'){
                                q.offer(new Coordinate(nextI, nextJ));
                                grid[nextI][nextJ] = '0';
                            }    
                        }
                    }
                }
            }
        }
        
        return count;
    }
    
    boolean isValid(int i, int j, int row, int col) {
        if( i < 0 || j < 0 || i >= row || j >= col){
            return false;
        }
        
        return true;
    }
    
    class Coordinate {
        int i;
        int j;
        
        Coordinate(int i, int j){
            this.i = i;
            this.j = j;
        }
        
    }
}