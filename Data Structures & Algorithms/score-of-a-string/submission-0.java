class Solution {
    public int scoreOfString(String s) {
        int n = 0;
        for(int i = 0; i < s.length() - 1; i++){
            n += Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1));
        }
        return n;
    }
}