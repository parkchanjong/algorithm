function solution(array) {
  return array.reduce((a, b) => a + b) / array.length;
}

const aws = solution([1, 2, 3, 4]);
console.log(aws);
