function solution(n) {
  const ternaryStr = n.toString(3).split("").reverse().join("");
  const decimal = parseInt(ternaryStr, 3);
  console.log(decimal);
  return decimal;
}

solution(125);
