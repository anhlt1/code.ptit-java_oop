package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class Thi_sinh{
    
    String name, dob;
    float x, y, z, sum;

    public Thi_sinh(String name, String dob, float x, float y, float z) {
        this.name = name;
        this.dob = dob;
        this.x = x;
        this.y = y;
        this.z = z;
        this.sum = x + y + z;
    }

    public void in(){
        System.out.print(name + " " + dob + " ");
        System.out.print(String.format("%.1f", sum));
    }
    
}

public class Khai_bao_lop_thi_sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        Thi_sinh t = new Thi_sinh(s1, s2, a, b, c);
        t.in();
    }
}
