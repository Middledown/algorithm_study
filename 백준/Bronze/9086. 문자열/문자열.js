const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().trim().split("\n");

const count = input[0];

for (i = 1; i <= count; i++) {
  let str = input[i].trim();

  console.log(str.slice(0, 1) + str.slice(-1));
}
