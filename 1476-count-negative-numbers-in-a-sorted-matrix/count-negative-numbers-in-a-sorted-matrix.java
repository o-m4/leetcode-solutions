class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int row = grid.length;
        int i = row-1;
        int j = 0;
        int col = grid[0].length;
        while(i>=0 && j<col){
            if(grid[i][j]<0){
                count += col-j;
                i--;
            }
            else{
                j++;
            }
        }
        return count;
        
    }
}