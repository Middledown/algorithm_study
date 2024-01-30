const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().split("\n").map((a) => +a);

let [N, F] = input;
let answer = ""
let number = parseInt(N / 100) * 100

while(true) {
    if(number % F == 0) {
        answer += number;
        break;
    } else {
        number++;
    }
}

console.log(answer.slice(-2))