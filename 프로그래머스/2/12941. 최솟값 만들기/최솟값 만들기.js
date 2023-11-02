// function solution(A,B){
//   A.sort((a, b) => {
//     return a - b
//   })
//   B.sort((a, b) => {
//     return b - a
//   })
//   console.log(A, B)
//   let result = 0;
//   for(let i = 0; i < A.length; i++) {
//     result += A[i] * B[i]
//   }
//   return result
// }

function solution(A,B){
    var answer = 0;
    A.sort((a,b)=> a-b);
    B.sort((a,b)=> b-a); 
    
   for (let i = 0; i < A.length; i++) {
       answer += A[i]*B[i];
   }
    return answer;
}