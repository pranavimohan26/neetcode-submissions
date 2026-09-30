class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashMap <Integer,Integer> misrep= new HashMap<>();

        for(int i = 0; i < grid.length;i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
            int value = grid[i][j];
            misrep.put(value,misrep.getOrDefault(grid[i][j],0)+1);
            }
        }
      
        int[] ans = new int[2];

        for(int i = 1; i <= grid.length * grid[0].length; i++)
        {
            if(!misrep.containsKey(i))
            {
                ans[1] = i;
            }
            if(misrep.getOrDefault(i,0) > 1)
            {
                ans[0] = i;
            }
        }
    return ans;
    }
}