package CSP201912;

import java.util.Scanner;

public class CSP201912_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int[] person = new int[4];
		int flag = 0;  //判断数字中是否含有7的flag。不含7：flag=0；含7：flag=1
		while(count <= n) {
			for(int i = 0; i < 4; i++) {
				if(count > n) {
					break;
				}
				//判断报的数中是否含有7
				int countCopy = count;
				while(countCopy != 0) {
					if(countCopy%10 == 7) {
						flag = 1;
					}
					countCopy /= 10;
				}
				//满足跳过条件的人跳过数+1
				if(count%7 == 0 || flag == 1) {
					person[i]++;
					n++; //跳过一次则最后报的数字往上+1
				}
				count++;
				flag = 0;
			}
		}
		for(int i = 0; i < 4; i++) {
			System.out.println(person[i]);
		}
	}
}


