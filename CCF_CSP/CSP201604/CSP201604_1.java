package CSP201604;

import java.util.Scanner;

public class CSP201604_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		int j = 1;
		int num = 0;
		int flag = 0;
		int judge = 0;
		while(j < arr.length) {
			judge = flag;
			if(arr[i] > arr[j]) {
				flag = 1;
			}else {
				flag = 0;
			}
			if(j != 1 && judge != flag) {
				num++;
			}
			i++;
			j++;
		}
		System.out.println(num);
	}
}
