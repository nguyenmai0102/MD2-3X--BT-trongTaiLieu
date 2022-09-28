package md3_bt;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {

        // tinh tong cacs so ow mot coot xacs ddinhj
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào dòng của ma trận");
        int n = scanner.nextInt();
        System.out.println("nhập vào cột của ma trận");
        int m = scanner.nextInt();

        // khởi tạo ma trận với m dòng và n cột;
        int [][] go = new int[n][m];

// nhap cac phan tu cho ma tran
        System.out.println("nhập các phần tử trong ma trận");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("go["+i+"]["+j+"]= ");
                go[i][j]= scanner.nextInt();

            }

        }
//  tinh tong các số theo chiều cột
        for (int i = 0; i < go.length; i++) {
            int total = 0;
            for (int j = 0; j < i; j++) {
                total = total+go[i][j];
            }
            System.out.println("tổng các số trong cột là: "+total);
        }

    }
}
