const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let [N, M] = input[0].split(" ").map((a) => Number(a));
let arr = Array(N)
  .fill(1)
  .map((a, b) => a + b);

for (let i = 1; i <= M; i++) {
  let [x, y] = input[i].split(" ").map((a) => Number(a));
  let tmp = arr[x - 1];
  arr[x - 1] = arr[y - 1];
  arr[y - 1] = tmp;
}

console.log(arr.join(" "));
