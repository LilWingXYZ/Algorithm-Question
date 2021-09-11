package CSP201812;

import java.util.Scanner;

public class CSP201812_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int y = sc.nextInt();
		int g = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[2];
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			if(arr[0] == 0) {
				sum += arr[1];
			}else if(arr[0] == 1) {
				sum += arr[1];
			}else if(arr[0] == 2) {
				sum += (arr[1] + r);
			}	
		}
		System.out.println(sum);
	}
}
