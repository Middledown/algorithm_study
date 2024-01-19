const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().split("\n");

const T = input[0];
let result = "";

for (let i = 1; i <= T; i++) {
  const items = input[i].split(" ");
  const times = Number(items[0]);
  const letter = items[1].split("");
  result = "";

  for (let j = 0; j < letter.length; j++) {
    result += letter[j].repeat(times);
  }
  console.log(result);
}