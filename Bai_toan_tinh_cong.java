package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class NV{
    String name, pos;
    int sal, day;

    public NV(String a, int b, int c, String d) {
        name = a;
        pos = d;
        sal = b;
        day = c;
    }
    
    public void in(){
        int luong = sal * day;
        int thuong = 0;
        if (day >= 25)
            thuong = luong * 20/100;
        else if (day >= 22 && day < 25)
            thuong = luong * 10/100;
        int phuCap = 0;
        if("GD".equals(pos))
            phuCap = 250000;
        else if ("PGD".equals(pos))
            phuCap = 200000;
        else if("TP".equals(pos))
            phuCap = 180000;
        else
            phuCap = 150000;
        int thuNhap = luong + thuong + phuCap;
        System.out.print("NV01 " + name + " " + luong + " " + thuong
        + " " + phuCap + " " + thuNhap);
        
    }
    
}

public class Bai_toan_tinh_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        NV t = new NV(s, a, b, c);
        t.in();
    }
}
