const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();
let num = Number(input);

if (90 <= num && num <= 100) {
  console.log("A");
} else if (80 <= num && num < 90) {
  console.log("B");
} else if (70 <= num && num < 80) {
  console.log("C");
} else if (60 <= num && num < 70) {
  console.log("D");
} else if (0 <= num && num < 60) {
  console.log("F");
}
