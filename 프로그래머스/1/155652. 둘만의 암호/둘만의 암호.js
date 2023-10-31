function solution(s, skip, index) {
  let answer = '';
  const alphabet = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"].filter((no) => !skip.includes(no))
  let arr = s.split("")
  
  for(let i = 0; i < arr.length; i++) {
    answer += alphabet[(alphabet.indexOf(arr[i]) + index) % alphabet.length];
  }
  
  return answer;
}