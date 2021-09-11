package CSP201803;

import java.util.Scanner;

public class CSP201803_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
		int score = 0;
		int flag = 0;
		int lastScore= 0;
		for(int i = 0; i < 30; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == 0) {
				break;
			}else if(arr[i] == 1) {
				score++;
				lastScore = 0;
				flag = 0;
			}else if(arr[i] == 2) {
				if(flag == 0) {
					score += 2;
				}else {
					score += (lastScore + 2);
				}
				lastScore += 2;
				flag = 1;
			}
		}
		System.out.println(score);
	}
}
