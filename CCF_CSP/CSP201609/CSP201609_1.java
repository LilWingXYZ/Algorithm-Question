package CSP201609;

import java.util.Scanner;
import java.lang.Math;

public class CSP201609_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		int j = 1;
		int max = 0;
		while(j < arr.length) {
			max = (Math.abs(arr[i] - arr[j]) > max) ? Math.abs(arr[i] - arr[j]) : max;
			i++;
			j++;
		}
		System.out.println(max);
	}
}
