class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++){
            result[index] = nums[i] * nums[i];
            index++;
        }

        Arrays.sort(result);

        return result;
    }
}