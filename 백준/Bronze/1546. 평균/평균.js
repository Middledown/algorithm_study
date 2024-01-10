const fs = require("fs");
const input = fs.readFileSync("dev/stdin").toString().split("\n");

const count = +input[0];
const score = input[1].split(" ").map((a) => +a);

let maxScore = Math.max(...score);

let answer = 0;

for (let i = 0; i < count; i++) {
  answer += (score[i] / maxScore) * 100;
}

console.log(answer / count);