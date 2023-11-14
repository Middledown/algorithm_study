function solution(survey, choices) {
  let table = { R: 0, T: 0, C: 0, F: 0, J: 0, M: 0, A: 0, N: 0 };
  for (let i = 0; i < survey.length; i += 1) {
    if (choices[i] <= 3) {
      table[survey[i][0]] += Math.abs(4 - choices[i]);
    } else if (choices[i] >= 5) {
      table[survey[i][1]] += Math.abs(4 - choices[i]);
    }
  }
  table = Object.entries(table);
  let result = "";
  for (let i = 0; i < 7; i += 2) {
    if (table[i][1] < table[i + 1][1]) {
      result = result.concat(table[i + 1][0]);
    } else {
      result = result.concat(table[i][0]);
    }
  }
  return result;
}