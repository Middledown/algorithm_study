const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().split(" ");

let num1 = Number(input[0].split("").reverse().join(""));
let num2 = Number(input[1].split("").reverse().join(""));

console.log(num1 > num2 ? num1 : num2);
