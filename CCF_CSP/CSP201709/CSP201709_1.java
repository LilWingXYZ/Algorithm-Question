package CSP201709;

import java.util.Scanner;

public class CSP201709_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int num = 0;
		
		while(money >= 50) {
			num += 7;
			money -= 50;
		}
		while(money >= 30) {
			num += 4;
			money -= 30;
		}
		num += money/10;
		System.out.println(num);
	}
}
