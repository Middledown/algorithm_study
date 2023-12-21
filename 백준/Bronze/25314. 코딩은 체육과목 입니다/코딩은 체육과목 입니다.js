const fs = require('fs');
const input = require('fs').readFileSync('/dev/stdin').toString();

const count = Number(input) / 4;

let printLong = '';


for (let i = 1; i <= count; i++) {

printLong += 'long ';

}


console.log(printLong + 'int');