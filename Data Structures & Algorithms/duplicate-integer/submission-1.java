public class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        int n = nums.length;

        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (nums[j] == nums[k]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                break;
            }
        }
        return duplicate;
    }

}