package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class TS {
    String code, name;
    double toan, ly, hoa, uutien, tong;

    public TS(String code, String name, double toan, double ly, double hoa) {
        this.code = code;
        this.name = name;
        this.toan = toan * 2;
        this.ly = ly;
        this.hoa = hoa;
        this.tong = this.toan + this.ly + this.hoa;
        if (code.charAt(2) == '1')
            this.uutien = 0.5;
        else if(code.charAt(2) == '2')
            this.uutien = 1.0;
        else 
            this.uutien = 2.5;
    }
    
    public void inRa(){
        System.out.print(code + " " + name + " ");
        if(uutien % 1 == 0.0)
            System.out.print((int)uutien);
        else
            System.out.printf("%.1f", uutien);
        System.out.print(" ");
        if(tong % 1 == 0.0)
            System.out.print((int)tong);
        else
            System.out.printf("%.1f", tong);
        if(tong + uutien >= 24)
            System.out.print(" TRUNG TUYEN");
        else
            System.out.print(" TRUOT");
    }
    
}

public class Bai_toan_tuyen_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        TS nvien = new TS(a, b, c, d, e);
        nvien.inRa();
    }
}
