function solution(arr) {
  let i = 1;
  let bool = false;

  while(!bool) {
    i++;
    for(let j = 1; j < arr.length; ++j){
      if((arr[0] * i) % arr[j]  === 0){
        bool = true;
      } else {
        bool = false;
        break;
      }
    }
  }
    
  return arr[0] * i;
}
