package md3_bt;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
// tìm số lớn nhất trong mảng 2 chiều
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        //khai bao ma tran baduk co m dong, n cot
        int baduk[][] = new int[m][n];

        System.out.println("nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("baduk[" + i + "][" + j + "] = ");
                baduk[i][j] = scanner.nextInt();
            }
        }
        // tim phan tu co gia tri lon nhat cua ma tran
        int max = baduk[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < baduk[i][j]) {
                    max = baduk[i][j];
                }
            }

        }
        System.out.println("phan tu lon nhat trong ma tran =" + max);
    }
}


