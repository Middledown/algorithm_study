const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString();

let count = Number(input)
let answer = "";

for(let i = 1; i <= count; i++) {
    answer += i + "\n"
}
console.log(answer)