const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().trim().split(" ").map((a) => +a);

const [a, b] = input

console.log(a + b)
