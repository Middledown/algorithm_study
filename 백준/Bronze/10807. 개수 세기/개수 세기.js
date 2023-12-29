const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const num = input[0];
const arr = input[1].split(' ');
const target = input[2];

let result = 0;
for (i = 0; i < num; i++) {
  if (arr[i] === target) {
    result++;
  }
}
console.log(result);
