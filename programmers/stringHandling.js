function solution(s) {
  return /^\d{4}$|^\d{6}$/.test(s) ? true : false;
}

solution(124);
