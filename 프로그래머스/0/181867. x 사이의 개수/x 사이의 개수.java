class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i].length();
        }
        if(myString.charAt(myString.length()-1) == 'x') {
            int[] result = new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++) {
                result[i] = answer[i];
            }
            result[result.length - 1] = 0;
            return result;
        }
        return answer;
    }
}