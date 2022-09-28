package md3_bt;

import java.util.Scanner;
// xoa phan tu trong mang;
public class bai1a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        System.out.println("khoi tao phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mang truoc khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        System.out.println();
        System.out.println("Nhap vao chi so phan tu can xoa: ");
        int index = Integer.parseInt(scanner.nextLine());
        int[] arrNew = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i < index) {
                arrNew[i] = arr[i];
            } else if (i == index) {
                continue;
            } else {
                arrNew[i - 1] = arr[i];
            }
        }
        System.out.println("Mang sau khi xoa la: ");
        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d\t", arrNew[i]);
        }
    }
}
