const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const count = parseInt(input[0].split(" ")[0]);
const target = parseInt(input[0].split(" ")[1]);
const arr = input[1].split(" ").map((a) => parseInt(a));
let answer = "";

for (let i = 0; i < count; i++) {
  if (arr[i] < target) {
    answer += arr[i] + " ";
  }
}

console.log(answer);
