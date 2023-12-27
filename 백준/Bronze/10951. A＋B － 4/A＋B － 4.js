const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

for (let i = 0; i < input.length; i++) {
  let [A, B] = input[i].split(" ");
  console.log(Number(A) + Number(B));
}
