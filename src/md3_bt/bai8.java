package md3_bt;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        char c;
        int count=0;


        // đếm số lần xuất hiện kí tự trong chuỗi
        Scanner scanner = new Scanner(System.in);
       // tạo chuỗi
        System.out.println("input string");
        String alpha = scanner.nextLine();
        //nhap so bat ki;
        char[] checka=alpha.toCharArray();
        System.out.println("nhap mot ki tu bat ki");
        char iput =scanner.nextLine().charAt(0);


        for (int i = 0; i < alpha.length(); i++) {
            if (checka[i]==iput){
                count++;
            }

        }
        System.out.println("so lan ki tu xuat hien : "+iput+ "trong chuoi"+ alpha + "="+count);
    }
}
