function solution(X, Y) {
  let answer = '';
  arrX = X.split('');
  arrY = Y.split('');
  
  for(let i = 0; i < 10; i++) {
    let x = arrX.filter(x => Number(x) === i).length;
    let y = arrY.filter(y => Number(y) === i).length;
    answer += i.toString().repeat(Math.min(x, y))
  }
  if(answer === '') return '-1'
  else if (answer.split('').filter(x => x === "0").length === answer.length) return '0'
  else return answer.split('').sort((a, b) => b -a).join('');
}