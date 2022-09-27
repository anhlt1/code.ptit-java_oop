package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class GV{
    
    String code, name;
    int luong, number, phu, salary;

    public GV(String str, String name, int luong) {
        this.code = str;
        this.name = name;
        this.luong = luong;
        int x = str.charAt(2) - 48;
        int y = str.charAt(3) - 48;
        this.number = x * 10 + y;
        if(str.charAt(0) == 'H' && str.charAt(1) == 'T')
            this.phu = 2000000;
        if(str.charAt(0) == 'H' && str.charAt(1) == 'P')
            this.phu = 900000;
        if(str.charAt(0) == 'G' && str.charAt(1) == 'V')
            this.phu = 500000;
        this.salary = this.phu + this.luong * this.number;
    }
    
    public void in(){
        System.out.print(code + " " + name + " " + number
        + " " + phu + " " + salary);
    }
    
}

public class Tinh_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = sc.nextInt();
        GV a = new GV(s1, s2, n);
        a.in();
    }
}
