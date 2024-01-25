const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs
  .readFileSync(file)
  .toString()
  .split(" ")
  .map((a) => +a);

const arr = [1, 1, 2, 2, 2, 8];
let arr2 = [];

for (let i = 0; i < arr.length; i++) {
  arr2.push(arr[i] - input[i]);
}

console.log(arr2.join(" "));
