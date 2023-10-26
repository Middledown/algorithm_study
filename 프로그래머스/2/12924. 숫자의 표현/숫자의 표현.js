// function solution(n) {
//   let answer = 0;
//   for(let i = n; i >= 1; i -= 1) {
//     let sum = 0;
//     let j = i;
//     while(sum + j <= n && j >= 1){
//       sum += j;
//       j -= 1;
//     }
//     if(sum == n) {
//       answer += 1;
//     }
//   }
//   return answer;
// }
// 위 풀이는 시간초과로 실패

function solution(n) {
    let answer = 0;
    for (let i = 1; i <= n; i++) {
        if (n % i === 0 && i % 2 === 1) answer++;
    }
    return answer;
}