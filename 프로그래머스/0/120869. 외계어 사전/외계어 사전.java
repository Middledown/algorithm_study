class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
				if (dic[i].contains(spell[j])) {
					dic[i] = dic[i].replaceFirst(spell[j], "");
				} else {
					dic[i] += spell[j];
				}
            }
        }
        for(int i = 0; i < dic.length; i++) {
            if(dic[i].equals("")) {
                answer = 1;
            }
        }
        return answer;
    }
}