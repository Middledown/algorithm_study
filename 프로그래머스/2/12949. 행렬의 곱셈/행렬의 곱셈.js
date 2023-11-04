function solution(arr1, arr2) {
  const newArr = [];

  for(let i = 0; i < arr1.length; i++) {
    let result = [];
      for(let j = 0; j < arr2[0].length; j++) {
        let times = 0;
        for(let k = 0; k < arr1[0].length; k++) { 
          times += arr1[i][k] * arr2[k][j];
        }
        result.push(times);
      }
    newArr.push(result);
  }
  return newArr;
}