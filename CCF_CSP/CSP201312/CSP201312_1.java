package CSP201312;

import java.util.Scanner;
import java.util.Arrays;

public class CSP201312_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int i = 0;
		int j = 1;
		int num = 1;
		int max = 1;
		int result = arr[0];
		while(j < arr.length) {
			if(arr[i] == arr[j]) {
				num++;
				if(max < num) {
					max = num;
					result = arr[i];
				}
			}else {
				num = 1;
			}
			i++;
			j++;
		}
		System.out.println(result);
	}
}
