// 효율성 검사 실패
// function solution(ingredient) {
//   let answer = 0;
//   let stack = ingredient.join("")
//   console.log(stack)
//   let i = 0;
//   while(i !== stack.length) {
//     if(stack.slice(i, i + 4) === "1231") {
//       stack = stack.slice(0, i) + stack.slice(i + 4)
//       answer++;
//       console.log(stack)
//       i = 0;
//     } else {
//       i++;
//     }
//   }
//   return answer;
// }
function solution(ingredient) {
  let answer = 0;
  let stack = [];
  
  for (let i = 0; i < ingredient.length; i++) {
    stack.push(ingredient[i]);
    
    if (stack.length >= 4) {
      let lastFour = stack.slice(-4).join('');
      if (lastFour === "1231") {
        stack.length -= 4;
        answer++;
      }
    }
  }
  
  return answer;
}