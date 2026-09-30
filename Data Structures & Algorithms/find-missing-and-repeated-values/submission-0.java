class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int temp = 0, temp1 = 0, value;

        int[] arr = new int[rows*cols];
        int k = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                arr[k] = grid[i][j]; 
                k++;           
            }
        }

        Arrays.sort(arr);

        HashMap<Integer, Integer> misrep = new HashMap<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                value = grid[i][j];
                misrep.put(value, misrep.getOrDefault(value, 0) + 1);
            }
        }
        int i = 1;
        for(int j = 0; j < rows*cols; j++){
            if(i == arr[j]){
                i++;
            }
            temp1 = i;
        }
        for (Map.Entry<Integer, Integer> entry : misrep.entrySet()) {
            if (entry.getValue() > 1) {
                temp = entry.getKey();
            }
        }
        return new int[] {temp, temp1};
    }
}