package md3_bt;

import java.util.Scanner;

public class bài5 {
    public static void main(String[] args) {
        // im so nho nhat trong mang

        // khoi tao mot mang va in ra gia tri
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số khởi tạo mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        int [] array = new int[n];

        System.out.println("nhập vào các giá trị của các phần tử trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            array[i] =Integer.parseInt(scanner.nextLine());
            }
        // mang sau khi khoi tao
        System.out.printf("mang sau khi khoi tao");
        for (int j = 0; j < args.length; j++) {
            System.out.printf("%d\t=",array[j]);
        }
        // tim so nho nhat
        int min = array[0];
        for (int j = 0; j < args.length; j++) {
            if (min >array[j]){
                min=array[j];
            }
        }
        System.out.println();
        System.out.println("so nho nhat trong mang la: "+min);
        System.out.printf("%d", min);

        }
     }



