package CSP201509;

import java.util.Scanner;

public class CSP201509_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int num = 0;
        while(j < arr.length) {
            if(num == 0) {
                num++;
            }
            if(arr[i] != arr[j]) {
                num++;
            }
            if(j == 0) {
                j++;
            }else{
                i++;
                j++;
            }
        }
        System.out.println(num);
    }
}