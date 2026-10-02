class Solution {
    public int[] findBuildings(int[] heights) {

        int[] temp = new int[heights.length];
        int k = 0;

        for(int i = 0; i < heights.length; i++) {

            boolean canSee = true;

            for(int j = i + 1; j < heights.length; j++) {

                if(heights[i] <= heights[j]) {
                    canSee = false;
                    break;
                }
            }

            if(canSee) {
                temp[k++] = i;
            }
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}