const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const N = Number(fs.readFileSync(file).toString());

for (let i = 1; i < N; i++) {
  let blank = " ".repeat(N - i);
  let stars = "*".repeat(i + (i - 1));
  console.log(blank + stars);
}

for (let i = N; i > 0; i--) {
  let blank = " ".repeat(N - i);
  let stars = "*".repeat(i + (i - 1));
  console.log(blank + stars);
}
