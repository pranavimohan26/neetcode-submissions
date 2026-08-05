class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        String[] arr = new String[details.length];
        int index = 0;

        for(int i = 0; i < details.length; i++){
            arr[index] = details[i].substring(11,13);
            index++;
        }

        for(int j = 0; j < arr.length; j++){
            if(Integer.parseInt(arr[j]) > 60){
                count++;
            }
        }
        return count;
    }
}