const input = require("fs").readFileSync("/dev/stdin").toString().trim();

let count = Number(input);
let answer = 0;

for (let i = 1; i <= count; i++) {
  answer += i;
}

console.log(answer);
