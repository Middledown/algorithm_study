class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] temp = new int[numbers.length];
        if(direction.equals("right")) {
            for(int i = 1; i < numbers.length; i++) {
                temp[i] = numbers[i - 1];
                temp[0] = numbers[numbers.length - 1];
            }    
        } else {
            for(int i = 1; i < numbers.length; i++) {
                temp[i - 1] = numbers[i];
                temp[numbers.length - 1] = numbers[0];
            }  
        }
        
        
        
        return temp;
    }
}