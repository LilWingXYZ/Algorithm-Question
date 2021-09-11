package CSP201809;

import java.util.Scanner;

public class CSP201809_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrInput = new int[n];
		int[] arrOut = new int[n];
		for(int i = 0; i < n; i++) {
			arrInput[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				arrOut[i] = (arrInput[i] + arrInput[i+1])/2;
			}else if(i == n-1) {
				arrOut[i] = (arrInput[i] + arrInput[i-1])/2;
			}else {
				arrOut[i] = (arrInput[i] + arrInput[i-1] + arrInput[i+1])/3;
			}
			System.out.print(arrOut[i] + " ");
		}
	}
}
