class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
            for(int j = 0; j < queries.length; j++) {
                int temp = arr[queries[j][0]];
                arr[queries[j][0]] = arr[queries[j][1]];
                arr[queries[j][1]] = temp;
            }
        return arr;
    }
}