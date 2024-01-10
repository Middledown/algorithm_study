const fs = require("fs");
const input = fs.readFileSync("dev/stdin").toString().split("\n");

const getDivisors = (num) => {
  const arr = [];
  let answer = 0;
  let result = "";

  if (num > 0) {
    for (let i = 1; i <= num / 2; i++) {
      if (num % i === 0) arr.push(i);
    }

    for (let i = 0; i < arr.length; i++) {
      answer += arr[i];
    }

    if (answer === Number(num)) {
      result += `${Number(num)} = 1`;
      for (let i = 1; i < arr.length; i++) {
        result += ` + ${arr[i]}`;
      }
    } else {
      result += `${Number(num)} is NOT perfect.`;
    }
  }

  console.log(result);
};

for (let i = 0; i < input.length; i++) {
  getDivisors(input[i]);
}
