package CSP201412;

import java.util.Scanner;

public class CSP201412_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrInput = new int[n];						
		final int N = 1001;
		int[] arrOut = new int[N];
		for(int i = 0; i < n; i++) {
			arrInput[i] = sc.nextInt();
			arrOut[arrInput[i]]++;
			System.out.print(arrOut[arrInput[i]] + " ");
		}
	}
}
