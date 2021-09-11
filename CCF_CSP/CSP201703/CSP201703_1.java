package CSP201703;

import java.util.Scanner;

public class CSP201703_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int num = 1;
		int sum = 0;
	
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(sum >= k && i < n-1) {
				num++;
				sum = 0;
			}
		}
		System.out.println(num);
	}
}
