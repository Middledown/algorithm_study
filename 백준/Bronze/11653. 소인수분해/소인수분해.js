const fs = require("fs");
const input = fs.readFileSync('dev/stdin').toString().split("\n");

let N = Number(input.shift());
let result = [];

for (let i = 2; i <= N; i++) {
  while (N % i === 0) {
    N = N / i;
    result.push(i);
  }

  if (N === 1) break;
}

for (let i = 0; i < result.length; i++) {
  console.log(Number(result[i]));
}
