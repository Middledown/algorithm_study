const fs = require("fs");
const input = fs.readFileSync('dev/stdin').toString().split("\n");

let numArr = [];
let numSum = 0;
let numMin = 0;

let minNum = Number(input[0]);
let maxNum = Number(input[1]);

const getDivisors = (num) => {
  const arr = [];

  for (let i = 1; i <= num / 2; i++) {
    if (num % i === 0) arr.push(i);
  }

  if (arr.length === 1) {
    numArr.push(num);
  }
};

for (let i = minNum; i <= maxNum; i++) {
  getDivisors(i);
}

for (let i = 0; i < numArr.length; i++) {
  numSum += numArr[i];
}

numMin = Math.min(...numArr);

console.log(numSum ? `${numSum}\n${numMin}` : "-1");
