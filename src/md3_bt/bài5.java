package md3_bt;

import java.util.Scanner;

public class bài5 {
    public static void main(String[] args) {
        // im so nho nhat trong mang

        // khoi tao mot mang va in ra gia tri
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số khởi tạo mảng: \n");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("nhập vào các giá trị của các phần tử trong mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("array [%d]=",i);
            array[i] =Integer.parseInt(scanner.nextLine());
            // tim so nho nhat
            int min = array[0];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j; k++) {
                    if (min >array[j]){
                        min=array[j];
                    }

                }

            }
System.out.println("so nho nhat trong mang la: "+min);
        }
    }
}

