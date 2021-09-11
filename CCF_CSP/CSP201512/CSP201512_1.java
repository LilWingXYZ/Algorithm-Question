package CSP201512;

import java.util.Scanner;

public class CSP201512_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		while(n/10 != 0) {
			num += n%10;
			n /= 10;  
		}
		num += n%10;
		System.out.println(num);
	}
}
