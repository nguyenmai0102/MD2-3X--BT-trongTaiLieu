package md3_bt;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // khoi tao mang thu nhat
        Scanner scanner = new Scanner(System.in);
        // khoi tao mang thu nhat
        System.out.println("nhap vao so phan tu cua mang thu 1: ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] old = new int[n];
       System.out.println("nhap gia tri cac phan tu cua mang thu nhat");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("old[%d]=", i);
            old[i]=Integer.parseInt(scanner.nextLine());
        }
        // khoi to mang thu hai
        System.out.printf("nhap vao gia tri cua mang thu 2");
        int m = Integer.parseInt(scanner.nextLine());
        int [] arr = new int [m];
        System.out.println("nhap vao gia tri cac phan tu cua mang thu 2");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
            arr[i]=Integer.parseInt(scanner.nextLine());

        }
        // khoi tao mang moi newArr voi ca phan tu la hai mang con
        int length = old.length+ arr.length;
        int [] newArr = new int [length];
        int pos = 0;
        // lưu phần tử mảng old vào newArr;
        for (int element: old) {
            newArr[pos] = element;
            pos++;
        }
        for (int element: arr) {
            newArr[pos] = element;
            pos++;
        }
        // hien thi mang moi ra man hinh
        System.out.println("mang moi la: "+ Arrays.toString(newArr));
    System.out.println("\n...........................");
    }
}
