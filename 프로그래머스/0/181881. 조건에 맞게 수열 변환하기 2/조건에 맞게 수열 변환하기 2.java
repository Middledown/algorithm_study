class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = new int[arr.length];
        boolean bool = false;
        while(!bool) {
            for(int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];   
            }

            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                } else {
                    continue;
                }
            }
            answer++;


            for(int i = 0; i < arr.length; i++) {
                if(temp[i] == arr[i]) {
                    bool = true;
                } else {
                    bool = false;
                    break;
                }
            }
        }
        return answer - 1;
    }
}