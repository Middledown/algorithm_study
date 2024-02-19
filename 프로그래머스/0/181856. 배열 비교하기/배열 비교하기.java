class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1 == len2) {
            int a = 0;
            int b = 0;
            for(int i = 0; i < len1; i++) {
                a += arr1[i];
                b += arr2[i];
            }
            if(a > b) {
                answer = 1;
            } else if (a < b) {
                answer = -1;
            } else {
                answer = 0;
            }
        } else if (len1 > len2) {
            answer = 1;
        } else if (len1 < len2) {
            answer = -1;
        }
        return answer;
    }
}