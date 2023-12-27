const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();

let answer = "";
let blank = "";

for (let i = 1; i <= input; i++) {
  answer += "*";
  for (let j = 0; j < input - i; j++) {
    blank += " ";
  }
  console.log(blank + answer);
  blank = "";
}
