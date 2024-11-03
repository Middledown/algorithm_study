class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            
            int n1 = Integer.parseInt(arr[0]);
            int n2 = Integer.parseInt(arr[2]);
            int n3 = Integer.parseInt(arr[4]);
            
            if(arr[1].equals("-")) {
                if(n1 - n2 == n3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if(arr[1].equals("+")) {
                if(n1 + n2 == n3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}