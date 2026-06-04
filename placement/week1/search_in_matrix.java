class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int idx = searchPotentialRow(matrix, target);
        if (idx != -1) {
            return binarySearchOverRow(idx, matrix, target);
        } else {
            return false;
        }
    } 

    private int searchPotentialRow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int lastCol = matrix[0].length - 1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            
            if (matrix[mid][0] <= target && target <= matrix[mid][lastCol]) {
                return mid;
            }
            else if (matrix[mid][0] < target) low = mid + 1;
            else high = mid - 1; 
        }
        return -1;
    }

    private boolean binarySearchOverRow(int idx, int[][] matrix, int target) {
        int low = 0;
        int high = matrix[idx].length - 1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[idx][mid] == target) {
                return true; 
            }
            else if (matrix[idx][mid] < target) low = mid + 1;
            else high = mid - 1; 
        }
        return false;
    }
}