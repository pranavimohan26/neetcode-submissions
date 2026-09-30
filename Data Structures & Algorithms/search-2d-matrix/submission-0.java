class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                map.put(matrix[i][j], map.getOrDefault(matrix[i][j],0) + 1);
            }
        }

        if(map.containsKey(target)){
            return true;
        }
        return false;

    }
}
