package java_oop;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == 0 && b != 0) {
            System.out.println("VN");
        } else if(a == 0 && b == 0) {
            System.out.println("VSN");
        } else {
            float c = (float) -b / a;
            System.out.printf("%.2f", c);
        }
    }
}
