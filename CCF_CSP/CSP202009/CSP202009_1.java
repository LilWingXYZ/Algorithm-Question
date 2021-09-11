package CSP202009;

import java.util.Scanner;
import java.lang.Math;

public class CSP202009_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[][] checkPoint = new int[n][2];
		int first = 1000001, firstCloseIndex = 0;
		int second = 1000001, secondCloseIndex = 0;
		int third = 1000001, thirdCloseIndex = 0;
		int d = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				checkPoint[i][j] = sc.nextInt();
			}
			d = (int)Math.pow((X - checkPoint[i][0]), 2) + (int)Math.pow((Y - checkPoint[i][1]), 2);
			if(d < first) {
				third = second;
				thirdCloseIndex = secondCloseIndex;
				second = first;
				secondCloseIndex = firstCloseIndex;
				first = d;
				firstCloseIndex = i;
			}else if (d < second) {
				third = second;
				thirdCloseIndex = secondCloseIndex;
				second = d;
				secondCloseIndex = i;
			}else if (d < third) {
				third = d;
				thirdCloseIndex = i;
			}
		}
		System.out.println(firstCloseIndex + 1);
		System.out.println(secondCloseIndex + 1);
		System.out.println(thirdCloseIndex + 1);
	}
}


/*
 * 上述方法每次都要更新三个值，过于繁琐，所以可采用C++中的 pair 进行简化实现
 */

//#include <iostream>
//#include <cmath>
//#include <algorithm>
//
//using namespace std;
//
//int main() {
//	int n,x,y;
//	cin>>n>>x>>y;
//	int point[n][2];
//	pair<int,int> closePoint[n];
//	for(int i = 0; i < n; i++) {
//		for(int j = 0; j < 2; j++) {
//			cin>>point[i][j];
//		}
//		int d = (int)pow(x - point[i][0], 2) + (int)pow(y - point[i][1], 2);
//		closePoint[i] = {d, i};
//	}
//	
//	sort(closePoint, closePoint + n);
//	
//	for(int i = 0; i < 3; i++) {
//		cout<<closePoint[i].second + 1<<endl; 
//	} 
//	return 0;
//}


/*
 * 或者使用Python中的元组进行简化实现
 */

//import math
//
//n,X,Y = map(int, input().split())
//closePoint = []
//for i in range(n):
//    x,y = map(int, input().split())
//    d = math.pow((X - x), 2) + math.pow((Y - y), 2)
//    closePoint.append((d, i))
//
//closePoint.sort()
//
//for i in range(3):
//    print(closePoint[i][1] + 1)


