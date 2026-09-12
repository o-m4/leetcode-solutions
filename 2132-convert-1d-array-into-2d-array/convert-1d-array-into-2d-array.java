class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        if(m*n!=original.length){
            int[][] emp = new int[0][];
            return emp;
        }
        else{
            for(int i = 0;i<m;i++){
                for(int j = 0;j<arr[0].length;j++){
                    arr[i][j] = original[i*n+j];
                }
            }
            return arr;
        }
    }
}