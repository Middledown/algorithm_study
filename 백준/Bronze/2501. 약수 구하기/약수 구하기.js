const fs = require("fs");
const input = fs.readFileSync("dev/stdin").toString().split(" ");

const num = input[0];
const target = input[1];
let arr = [];

for (let i = 1; i <= num; i++) {
  if (num % i === 0) {
    arr.push(i);
  }
}

console.log(arr[target - 1] ? arr[target - 1] : 0);
