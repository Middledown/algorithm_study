import java.util.Arrays;

class Solution {
    public long solution(String numbers) {
        String [] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < arr.length; i++) {
            if(numbers.contains(arr[i])) {
                numbers = numbers.replaceAll(arr[i], i + "");
            }
        }
        long answer = Long.parseLong(numbers);
        return answer;
    }
}