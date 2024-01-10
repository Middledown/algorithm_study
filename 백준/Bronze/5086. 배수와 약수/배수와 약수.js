const fs = require("fs");
const input = fs.readFileSync("dev/stdin").toString().split("\n");

for (let i = 0; i < input.length; i++) {
  let a = Number(input[i].split(" ")[0]);
  let b = Number(input[i].split(" ")[1]);
  if (a % b === 0) {
    console.log("multiple");
  } else if (b % a === 0) {
    console.log("factor");
  } else if (a === 0 && b === 0) {
    break;
  } else {
    console.log("neither");
  }
}
