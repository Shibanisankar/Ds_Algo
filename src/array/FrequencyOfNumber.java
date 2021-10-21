package array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumber {
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,4,3};
		System.err.println(counts(nums));
	}
	
	public static Map<Integer,Integer> counts(int[] nums){
		Map<Integer,Integer> results = new HashMap<>();
		for( int i : nums) {
			if(results.containsKey(i)) {
				results.put(i,results.get(i)+1);
			} else {
				results.put(i,1);
			}
		}
		return results;
	}

}
