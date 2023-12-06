function solution(numbers, target) {
  let answer = 0;

  function dfs(count, sum) {
    if (count === numbers.length) {
      if (target === sum) {
        answer++;
      }
      return;
    }
    dfs(count + 1, sum + numbers[count]);
    dfs(count + 1, sum - numbers[count]);
  }

  dfs(0, 0);

  return answer;
}