package digitsum;

import java.util.HashSet;
import java.util.Set;

class Solution {
     public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set.stream().sorted().mapToInt(Integer::intValue).toArray());
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

	public void solution() {
	}
}
