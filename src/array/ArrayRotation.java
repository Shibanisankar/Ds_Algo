package array;

import java.util.Arrays;

/**
 * Example
 * --------
 * Right Shift element by 3
 * Input 1,2,3,4,5,6,7,8
 * Output 6,7,8,1,2,3,4,5
 *
 */
public class ArrayRotation {

	static int[]  rotate(int[] a, int no) {
		int endIndex = a.length -1;
		reverse(a,0,endIndex-no);
		reverse(a,endIndex-no+1,endIndex);
		reverse(a,0,endIndex);
		return a;
	}
	
	static void reverse(int[] a,int start,int end) {
		while(start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		System.out.print(Arrays.toString(rotate(a, 3)));
	}
	
}
