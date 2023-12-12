const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let A = input[0];
let B = input[1];

console.log(Number(A) * Number(B.slice(-1)));
console.log(Number(A) * Number(B.slice(-2, -1)));
console.log(Number(A) * Number(B.slice(-3, -2)));
console.log(Number(A) * Number(B));
