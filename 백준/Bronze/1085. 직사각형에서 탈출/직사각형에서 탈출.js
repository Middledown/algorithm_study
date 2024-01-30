const fs = require("fs");
const file = process.platform === "linux" ? "dev/stdin" : "input.txt";
const input = fs.readFileSync(file).toString().split(" ").map((a) => +a);

let [x, y, w, h] = input;


let xw = w - x;
let x0 = x;
let yh = h - y;
let y0 = y;

console.log(Math.min(xw, x0, yh, y0))