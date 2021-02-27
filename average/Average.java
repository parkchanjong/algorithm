package average;

public class Average {
  public double solution(int[] arr) {
    int sum = 0;
    double average = 0;

    for(int i=0;i<arr.length;i++){
      sum += arr[i];
    }
    average = (double) sum/arr.length;

    return average;
  }
}