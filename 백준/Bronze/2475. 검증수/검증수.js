const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().split(" ").map((a) => +a);

let answer = 0;

for(let i= 0; i < input.length; i++) {
    answer += input[i] * input[i]
}

console.log(answer % 10)
