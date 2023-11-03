function solution(n,a,b) {
  let answer = 0;
  
  // a 와 b가 다를 때 while문 타기
  while(a !== b) {
    a = Math.ceil(a / 2);
    b = Math.ceil(b / 2);
    answer++;
  }
  
  return answer;
}