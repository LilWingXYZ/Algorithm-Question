package CSP202012;

import java.util.Scanner;
import java.lang.Math;

public class CSP202012_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] index = new int[n][2];
		int x = 0;
		int y = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				index[i][j] = sc.nextInt();
			}
			x += index[i][0] * index[i][1];
		}
		y = Math.max(0, x);
		System.out.println(y);
	}
}
