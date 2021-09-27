package CSP202109;

import java.util.Scanner;

public class CSP202109_1 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		int max = 0;
		int min = 0;
		for(int i = 1; i < n; i++) {
			max += input[i-1];
			if(input[i-1] == input[i]) {
				min += 0;
			}else {
				min += input[i];
			}
		}
		min += input[0];
		max += input[n-1];
		System.out.println(max);
		System.out.println(min);
	}
}
