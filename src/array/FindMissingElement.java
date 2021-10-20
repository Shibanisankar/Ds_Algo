package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMissingElement {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(
	            new InputStreamReader(System.in));
		String str[] = bi.readLine().split(" ");
		int[] nums = new int[str.length];
		for(int i=0;i<str.length;i++) {
			nums[i]=Integer.parseInt(str[i]);
		}
		System.out.print(missingNumber(nums,0,nums.length-1,nums[0]));
	}

	private static int missingNumber(int[] nums,int low,int high,int diff) {
		int mid = (high+low)/2;
		if(high == low) 
			return low + diff;
		else if(mid + diff < nums[mid]) 
			return missingNumber(nums, low, mid,diff);
		else
			return missingNumber(nums, mid+1, high,diff);
	}
}


