class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                pos.add(nums[i]);
            }
            else {
                neg.add(nums[i]);
            }
        }

        int p = 0;
        int n = 0;

        for(int i = 0; i < nums.length; i++) {

            if(i % 2 == 0) {
                ans[i] = pos.get(p);
                p++;
            }
            else {
                ans[i] = neg.get(n);
                n++;
            }
        }

        return ans;
    }
}