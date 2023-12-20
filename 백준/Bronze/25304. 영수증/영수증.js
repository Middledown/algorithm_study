const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let total = Number(input[0]);
let count = Number(input[1]);
let answer = 0;

for (let i = 2; i < count + 2; i++) {
  let arr = input[i].split(" ").map((a) => Number(a));

  answer += arr[0] * arr[1];
}

console.log(total === answer ? "Yes" : "No");
