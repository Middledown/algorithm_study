const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().split("\n");

const count = Number(input[0]);
const num = input[1];
let answer = 0;

for (let i = 0; i < count; i++) {
  answer += Number(num[i]);
}

console.log(answer);
