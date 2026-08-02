class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int k = n + m;
        char[] result = new char[k];

        int i = 0;
        int j = 0;
        int index = 0;

        while (i < n && j < m) {
            result[index++] = word1.charAt(i++);
            result[index++] = word2.charAt(j++);
        }

        while (i < n) {
            result[index++] = word1.charAt(i++);
        }

        while (j < m) {
            result[index++] = word2.charAt(j++);
        }

        return new String(result);
    }
}