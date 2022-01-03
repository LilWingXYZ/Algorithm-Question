package CSP202112;

import java.util.Scanner;

public class CSP202112_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[n+1];
		A[0] = 0;
		for(int i = 1; i < n+1; i++) {
			A[i] = sc.nextInt();
		}
		int sum = 0;
		int count = 0;
		for(int i = N-1; i >= 0; i--) {
			if(i >= A[n]) {
				count++;
			}else {
				sum += n*count;
				count = 0;
				n--;
				i++;
			}
		}
		System.out.println(sum);
	}
}
