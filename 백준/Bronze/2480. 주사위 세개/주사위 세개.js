let fs = require("fs");
const input = require("fs")
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split(" ")
  .map(Number)
  .sort((x, y) => y - x);

let [a, b, c] = input;

if (a === b && b === c) {
  console.log(10000 + a * 1000);
} else if (a === b || b === c) {
  console.log(1000 + b * 100);
} else if (a !== b && b !== c) {
  console.log(a * 100);
}
