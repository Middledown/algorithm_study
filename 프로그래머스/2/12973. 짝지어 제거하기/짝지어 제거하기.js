// 효율성 검사 실패 코드
// function solution(s) {
//   let sArr = s.split("")

//   for(let i = 0; i < sArr.length; i++) {
//     if(sArr[i] === sArr[i + 1]) {
//       sArr.splice(i, 2);
//       i = -1;
//     }
//   }
    
//   return sArr.length === 0 ? 1 : 0;
// }

function solution(s) {
    const stack = [];
    
    for (let i = 0; i < s.length; i++) { 
        if(stack[stack.length - 1] === s[i]) {
            stack.pop();
        } else {
            stack.push(s[i]);
        }
    }
    
    return !stack.length ? 1 : 0;
}