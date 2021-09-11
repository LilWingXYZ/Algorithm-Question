package CSP201903;

import java.util.Scanner;

public class CSP201903_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = 10000000;
		int max = -10000000;
		int mid_index = 0;
		double mid = 0.0; //保留一位小数
		int l = 0, r = arr.length - 1;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			min = (arr[i] < min) ? arr[i] : min;
			max = (arr[i] > max) ? arr[i] : max;
		}
		mid_index = l + (r - l)/2;
		if(n%2 == 0) {  //n为偶数
			double sum = 0.0;
			sum = arr[mid_index] + arr[mid_index + 1];
			mid = sum/2;  // double/int才能保证最终数有小数点；
						  // 两整数相加再除以2肯定只有一位小数0.5，所以不用单独考虑四舍五入
		}else {  //n为奇数
			mid = arr[mid_index];
		}
		if(mid - (int)mid == 0) {  //整数就输出整数
			System.out.print(max + " " + (int)mid + " " + min);
		}else { //输出小数
			System.out.print(max + " " + mid + " " + min);
		}
	}
}
