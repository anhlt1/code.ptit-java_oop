package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class SV{
    
    String name, lp, dob;
    float score;

    public SV() {
        name = lp = dob = "";
        score = 0;
    }

    public SV(String name, String lp, String dob, float score) {
        this.name = name;
        this.lp = lp;
        this.score = score;
        String res = "";
        String[] a = dob.split("/");
        for(int i = 0 ; i < a.length ; ++i)
        {
            if(a[i].length() == 1)
            {
                res += "0";
                res += a[i] + "/";
            }
            else if(a[i].length() == 4) {
                res += a[i];
            }
            else {
                res += a[i] + "/";
            }
        }
        this.dob = res;
    }
    
    public void in(){
        System.out.print("B20DCCN001 " + name + " " + lp + " " + dob 
        + " ");
        System.out.print(String.format("%.2f", score));
    }
    
}

public class Khai_bao_lop_sinh_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        float d = sc.nextFloat();
        SV a = new SV(s1, s2, s3, d);
        a.in();
    }
}
