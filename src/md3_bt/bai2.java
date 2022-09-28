package md3_bt;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class bai2 {
   public static void main(String[] args) {
   // nhap so phan tu cuan mang
       Scanner scanner = new Scanner(System.in);
       System.out.println("nhap so phan tu cua mang");
       int n = Integer.parseInt(scanner.nextLine());
       int [] old = new int[n];
       System.out.println("khoi tao so phan tu trong mang");
       for (int i = 0; i < n; i++) {
           old[i]=Integer.parseInt(scanner.nextLine());
       }
       System.out.println("mang truoc khi them");
       for (int i = 0; i < n; i++) {
           System.out.printf("%d\t", old[i]);
       }
       System.out.println("nhap vao gia tri can them");
       int valueInsert = Integer.parseInt(scanner.nextLine());
       System.out.println("nhap vao chi so can them");
       int indexInsert = Integer.parseInt(scanner.nextLine());
       // khoi tao mang moi de chua cacs phan tu can them
int[] arrNew = new int [old.length+1];
// copy phan tu  cu va them phan tu moi
       for (int i = 0; i < arrNew.length; i++) {
           if (i<indexInsert){
               arrNew[i] = old[i];
           }else if (i==old[i]){
               arrNew[i]=valueInsert;
           }else {
               arrNew[i] = old[i-1];
           }
       }
// in mang moi tu mang cu;
       System.out.println("gia tri cac phan tu sau khi them moi: ");
       for (int i = 0; i < arrNew.length; i++) {
           System.out.printf("%d\t", arrNew[i]);
       }
       System.out.printf("\n");
}
}
