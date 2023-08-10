function solution(babbling) {
  const speak = ['aya','ye','woo','ma'];
  let count = 0;
    
  for(let i = 0; i < babbling.length; i++){
    let word = babbling[i];
        
    for(let j = 0; j < speak.length; j++){
      if(word.includes(speak[j].repeat(2))){
        break;
      }
            
      word = word.split(speak[j]).join(" ");
    }
        
    if(word.split(" ").join("").length === 0){
      count++;
    }
  }
    
  return count;
}