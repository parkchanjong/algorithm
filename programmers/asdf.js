let array = [3, 2, 1];

let array2 = [4, 3, 2, 1];

var bubbleSort = function (array) {
  var length = array.length;
  var i, j, temp;
  for (i = 0; i < length - 1; i++) {
    // n번째, n+1 번째 비교해서 큰수를 뒤로 보냄
    // length - 1 까지만 반복해야함
    // 가장 큰수를 뒤로 보내는 반복문
    for (j = 0; j < length - 1 - i; j++) {
      // 안쪽반복문은 바깥 반복문이 돌때마다 배열의 뒤쪽부터 정렬이 됨
      // 바깥 반복문이 한번 돌 때마다 안쪽반복문의 반복횟수를 1씩 차감시킴
      // 인접한 배열 요소의 크기를 비교하여 자리를 바꾸는 반복문
      if (array[j] > array[j + 1]) {
        // 두 수를 비교하여 앞 수가 뒷 수보다 크면
        temp = array[j]; // 두 수를 서로 바꿔준다
        array[j] = array[j + 1];
        array[j + 1] = temp;
      }
    }
  }

  return array;
};

console.log(bubbleSort(array2));
