package CSP201712;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class CSP201712_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int d = 10000;
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i+1]) {
				d = 0;
				break;
			}else {
				d = (Math.abs(arr[i] - arr[i+1]) < d) ? Math.abs(arr[i] - arr[i+1]) : d;
			}
		}
		System.out.println(d);
	}
}
