const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

input = +input[0];
if ((input % 4 === 0 && input % 100 !== 0) || input % 400 === 0) {
  console.log(1);
} else console.log(0);