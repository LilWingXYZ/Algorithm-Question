package CSP201909;

import java.util.Scanner;
import java.lang.Math;

public class CSP201909_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m+1];
		int[] sumOne = new int[n];  //其中一棵树的总和
		int sum = 0;
		int max = 0;
		int max_index = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= m; j++) {
				arr[i][j] = sc.nextInt();
				sumOne[i] += arr[i][j];
			}
			sum += sumOne[i];
			if(Math.abs(sumOne[i] - arr[i][0]) > max) {
				max = Math.abs(sumOne[i] - arr[i][0]);
				max_index = i;
			}
		}
		System.out.print(sum + " " + (max_index+1) + " " + max);
	}
}
