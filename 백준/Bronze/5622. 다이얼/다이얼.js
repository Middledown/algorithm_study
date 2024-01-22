const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().trim().split("");

const number = {
  ABC: 3,
  DEF: 4,
  GHI: 5,
  JKL: 6,
  MNO: 7,
  PQRS: 8,
  TUV: 9,
  WXYZ: 10,
};

let sum = 0;

for (i = 0; i < input.length; i++) {
  for (let x in number) {
    if (x.includes(input[i])) {
      sum += number[x];
    }
  }
}

console.log(sum);
