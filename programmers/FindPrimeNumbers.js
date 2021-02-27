function solution(n) {
  const primeNumbers = new Set();
  for (let i = 3; i <= n; i += 2) {
    primeNumbers.add(i);
  }
  primeNumbers.add(2);
  for (let j = 3; j ** 2 < n; j++) {
    if (primeNumbers.has(j)) {
      for (let k = j ** 2; k <= n; k += j) {
        primeNumbers.delete(k);
      }
    }
  }
  console.log(primeNumbers, primeNumbers.size);
  return primeNumbers.size;
}

solution(5);
