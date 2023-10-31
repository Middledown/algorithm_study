function solution(s) {
  let stack = [];
  let cnt_s = 0
  let cnt_d = 0
  let first = ''
  let reset = 'X'
  let elemt = ''
  
  for(let i = 0; i < s.length; i++) {
    if ( reset === 'X' ) {
      first = s[i]
    }
    
    if ( s[i] === first ) {
      reset = ''
      cnt_s++;
    } else {
      cnt_d++;
    }
    elemt += s[i]
    
    if ( cnt_s === cnt_d || i === s.length - 1 ) {
      reset = 'X'
      stack.push(elemt)
      elemt = ''
      cnt_s = 0
      cnt_d = 0
    }
  }
  
  return stack.length;
}