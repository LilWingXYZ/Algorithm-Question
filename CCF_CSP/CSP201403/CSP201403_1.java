package CSP201403;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class CSP201403_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int i = 0;
		int j = n - 1;
		int num = 0;
		while(i < j) {
			if((arr[i] + arr[j]) == 0) {
				num++;
				i++;
				j--;
			}
			else if(Math.abs(arr[i]) > Math.abs(arr[j])) {
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println(num);
	}
}
