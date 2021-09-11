package CSP201409;

import java.util.Scanner;
import java.util.Arrays;

public class CSP201409_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int i = 0;
		int j = 1;
		int num = 0;
		while(j < arr.length) {
			if(arr[j] - arr[i] == 1) {
				num++;
			}
			i++;
			j++;
		}
		System.out.println(num);
	}
}
