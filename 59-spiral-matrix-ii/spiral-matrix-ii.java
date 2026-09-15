class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int num = 1;

        while (left <= right && top <= bottom) {
            // left -> right (top row)
            for (int col = left; col <= right; col++) {
                arr[top][col] = num++;
            }
            top++;

            // top -> bottom (right column)
            for (int row = top; row <= bottom; row++) {
                arr[row][right] = num++;
            }
            right--;

            // right -> left (bottom row)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    arr[bottom][col] = num++;
                }
                bottom--;
            }

            // bottom -> top (left column)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    arr[row][left] = num++;
                }
                left++;
            }
        }

        return arr;

    }
}