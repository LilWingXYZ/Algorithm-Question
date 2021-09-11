package CSP202006;

import java.util.Scanner;

public class CSP202006_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] point = new int[n][3];  //数据点
		int[][] query = new int[m][3];  //查询函数
		//读取数据点
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				//将字符“A”和“B”转换为int数据0和1
				if(j == 2) {
					String type = sc.nextLine();
					type = type.trim(); //去除字符串中的空格
					if(type.equals("A")) {
						point[i][j] = 0;
					}else if(type.equals("B")) {
						point[i][j] = 1;
					}
					break;
				}
				point[i][j] = sc.nextInt();
			}
		}
		//读取查询函数
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < 3; j++) {
				query[i][j] = sc.nextInt();
			}
		}
		/*
		 * 判断每个查询函数是否能分割所有数据点
		 * 判断方法：所有同类的点在同一个查询函数里计算出来的最终结果都是正的或是负的，则说明该查询函数能分割所有点
		 *        否则，说明该查询函数不能分割所有点
		 */
		for(int i = 0; i < m; i++) {
			//刚开始并不知道“A”和“B”哪一类可以使查询函数变为正或负
			//所以先判断“A”和“B”哪一类可以使查询函数变为正或负
			int flagMax = 2;
			int flagMin = 2;
			for(int j = 0; j < n; j++) {
				while(flagMax == 2 || flagMin == 2) {
					if(query[i][0] + query[i][1] * point[j][0] + query[i][2] * point[j][1] > 0) {
						flagMax = point[j][2];
						j++;
					}else {
						flagMin = point[j][2];
						j++;
					}
				}
				break;
			}
			//判断每个查询函数是否能分割所有数据点
			//判断出一个则该类别数量++
			int max = 0;
			int min = 0;
			for(int j = 0; j < n; j++) {
				if((query[i][0] + query[i][1] * point[j][0] + query[i][2] * point[j][1] > 0) && (point[j][2] == flagMax)) {
					max++;
				}else if ((query[i][0] + query[i][1] * point[j][0] + query[i][2] * point[j][1] < 0) && (point[j][2] == flagMin)) {
					min++;
				}
			}
			//能把所有点都分割正确的输出“Yes”，否则输出“No”
			if(max + min == n) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}

