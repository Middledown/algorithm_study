const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().split(" ");

let arr = [];
let result = "";

for (let i = 97; i <= 122; i++) {
  let target = String.fromCharCode(i);

  for (let j = 0; j < input.length; j++) {
    arr.push(input[j].indexOf(target));
  }
}

result = arr.join(" ");
console.log(result);
