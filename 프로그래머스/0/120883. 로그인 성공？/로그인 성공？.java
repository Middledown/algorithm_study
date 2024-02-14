class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i = 0; i < db.length; i++) {
            int count;
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                answer = "login";
                break;
            } else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
                if (!answer.equals("login"))
                answer = "wrong pw";
            } else {
                if (!answer.equals("login") && !answer.equals("wrong pw") )
                answer = "fail";
            }
        }
        
        return answer;
    }
}