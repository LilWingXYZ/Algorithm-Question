package CSP201503;

import java.util.Scanner;

public class CSP201503_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[m-1-j][i] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


/*
 * Java内存超限只得到90分，改用C++得到100分
 */

//#include <iostream>
//
//using namespace std;
//
//int main() {
//	int n,m;
//	cin>>n>>m;
//	int arr[m][n];
//	for(int i = 0; i < n; i++) {
//		for(int j = 0; j < m; j++) {
//			cin>>arr[m-1-j][i];
//		}
//	}
//	for(int i = 0; i < m; i++) {
//		for(int j = 0; j < n; j++) {
//			cout<<arr[i][j]<<" ";
//		}
//		cout<<endl;
//	}
//	return 0;
//}