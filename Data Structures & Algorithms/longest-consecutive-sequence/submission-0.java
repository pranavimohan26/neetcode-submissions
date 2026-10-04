class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        int lencount = 0;
        int tempcount = 0;
        for(int x : nums){
            if(!set.contains(x-1)){
                int currnum = x;
                tempcount = 1;
            
            while(set.contains(currnum+1)){
                currnum+=1;
                tempcount++;
            }
            }
        lencount = Math.max(lencount, tempcount);
        }
        return lencount;
    }
}
