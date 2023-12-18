var fs = require("fs");
const input = require("fs").readFileSync("/dev/stdin").toString().split("\n");

let a = parseInt(input[0].split(" ")[0]);
let b = parseInt(input[0].split(" ")[1]);
let c = parseInt(input[1]);

let h = Math.floor((a * 60 + b + c) / 60);
let m = (a * 60 + b + c) % 60;
if (h >= 24) {
  h -= 24;
}
console.log(`${h} ${m}`);
