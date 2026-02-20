class Solution {
    //Global variables
    int[][] grid;
    int target;
    int n;

    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        
        this.n=grid.length;

        this.grid=grid;
        this.target=n*n-1;

        int[] currPos={0,0};
        return moveKnight(currPos, 0);
    }
    boolean moveKnight(int[] currPos, int curr){
        int x=currPos[0];
        int y=currPos[1];
        
        //If Valid configuration
        if(curr == target)  return true;

        //Else check all 8 possible valid moves, for the next move made
        //1
        if(x+1>=0 && x+1<n && y-2>=0 && y-2<n && grid[x+1][y-2] == curr+1){
            return moveKnight(new int[] {x+1, y-2}, curr+1);
        }
        //2
        if(x+2>=0 && x+2<n && y-1>=0 && y-1<n && grid[x+2][y-1] == curr+1){
            return moveKnight(new int[] {x+2, y-1}, curr+1);
        }
        //3
        if(x+2>=0 && x+2<n && y+1>=0 && y+1<n && grid[x+2][y+1] == curr+1){
            return moveKnight(new int[] {x+2, y+1}, curr+1);
        }
        //4
        if(x+1>=0 && x+1<n && y+2>=0 && y+2<n && grid[x+1][y+2] == curr+1){
            return moveKnight(new int[] {x+1, y+2}, curr+1);
        }
        //5
        if(x-1>=0 && x-1<n && y+2>=0 && y+2<n && grid[x-1][y+2] == curr+1){
            return moveKnight(new int[] {x-1, y+2}, curr+1);
        }
        //6
        if(x-2>=0 && x-2<n && y+1>=0 && y+1<n && grid[x-2][y+1] == curr+1){
            return moveKnight(new int[] {x-2, y+1}, curr+1);
        }
        //7
        if(x-2>=0 && x-2<n && y-1>=0 && y-1<n && grid[x-2][y-1] == curr+1){
            return moveKnight(new int[] {x-2, y-1}, curr+1);
        }
        //8
        if(x-1>=0 && x-1<n && y-2>=0 && y-2<n && grid[x-1][y-2] == curr+1){
            return moveKnight(new int[] {x-1, y-2}, curr+1);
        }
        //Else Invalid configuration
        return false;
    }
}
