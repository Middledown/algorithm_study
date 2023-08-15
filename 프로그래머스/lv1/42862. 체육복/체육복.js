function solution(n, lost, reserve) {
  let answer = 0;
  let uniform = new Array(n).fill(1);
  
  for(let i = 0; i < lost.length; i++) {
    uniform[lost[i] - 1]--;
  }
  
  for(let i = 0; i < reserve.length; i++) {
    uniform[reserve[i] - 1]++;
  }
  for(let i = 0; i < uniform.length; i++) {
    if(uniform[i] === 0) {
      if(uniform[i - 1] === 2) {
        uniform[i]++;
        uniform[i - 1]--;
      } else if (uniform[i + 1] === 2) {
        uniform[i]++;
        uniform[i + 1]--;
      }
    }
    if(uniform[i] >= 1) {
      answer++;
    }
  }
  return answer
}