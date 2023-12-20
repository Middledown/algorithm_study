let fs = require("fs");
const input = require("fs").readFileSync("/dev/stdin").toString().trim();

for (let i = 1; i < 10; i++) {
  let a = i * input;
  console.log(`${input} * ${i} = ${a}`);
}
