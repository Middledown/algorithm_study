const fs = require("fs");
const input = fs.readFileSync('dev/stdin').toString().split("\n");

let answer = 0;

const getDivisors = (num) => {
  const arr = [];

  for (let i = 1; i <= num / 2; i++) {
    if (num % i === 0) arr.push(i);
  }

  // arr의 길이를 1로 설정한 이유는 약수가 자기자신 빼고 하나만 있어야 소수이기 때문
  // 1도 자동으로 걸러짐
  if (arr.length === 1) {
    answer++;
  }
};

let count = Number(input[0]);
let target = input[1].split(" ");

for (let i = 0; i < count; i++) {
  getDivisors(Number(target[i]));
}

console.log(answer);
