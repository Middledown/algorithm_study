const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n").map(Number);

let arr = [];

for (let i = 1; i < 31; i++) {
  if (input.includes(i)) continue;
  arr.push(i);
}

arr.sort((a, b) => a - b);

console.log(arr[0]);
console.log(arr[1]);
