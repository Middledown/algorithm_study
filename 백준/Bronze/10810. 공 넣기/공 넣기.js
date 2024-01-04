const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const [n, m] = input[0].split(" ").map((a) => +a);
const arr = new Array(n).fill(0);

for (let i = 1; i <= m; i++) {
  let [a, b, c] = input[i].split(" ").map((acc) => +acc);

  for (let j = a; j <= b; j++) {
    arr[j - 1] = c;
  }
}

console.log(arr.join(" "));
