class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = n + m;
        for(int i = 0; i < n; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}