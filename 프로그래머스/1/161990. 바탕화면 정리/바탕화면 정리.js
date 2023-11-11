function solution(wallpaper) {
  let rowLen = wallpaper[0].length;
  let colLen = wallpaper.length;

  let xList =[];
  let yList = [];
    
  for (let i=0 ; i<colLen ; i++){
    for (let j=0 ; j<rowLen ; j++){
      if (wallpaper[i][j]==="#"){
        xList.push(j);
        yList.push(i);
      }
    }
  }

  return [Math.min(...yList),Math.min(...xList),Math.max(...yList)+1,Math.max(...xList)+1];
}
