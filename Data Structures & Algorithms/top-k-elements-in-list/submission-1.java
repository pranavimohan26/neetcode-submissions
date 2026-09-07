class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // 1. Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        // 2. Find top K
        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int maxElement = 0;

            // Find element with highest frequency
            for (int num : map.keySet()) {

                if (map.get(num) > maxFreq) {
                    maxFreq = map.get(num);
                    maxElement = num;
                }
            }

            // Store it
            result[i] = maxElement;

            // Remove it so we don't select it again
            map.remove(maxElement);
        }

        return result;
    }
}