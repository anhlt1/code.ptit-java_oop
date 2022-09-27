package java_oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anhla
 */

class SV{
    String name, lp, dob, code;
    double gpa;

    public SV() {
    }

    public SV(String name, String lp, String dob, double gpa) {
        this.name = name;
        this.lp = lp;
        this.dob = dob;
        this.gpa = gpa;
    }
    
    
}

public class Danh_sach_doi_tuong_sinh_vien_2 {
    public static String convert(String s){
        if(s.charAt(1) == '/')
            s = "0" + s;
        if(s.charAt(4) == '/')
            s = s.substring(0, 3) + "0" + s.substring(3);
        return s;
    }
    public static String standard(String s){
        s = s.trim();
        while(s.contains("  "))
            s = s.replace("  ", " ");
        String[] a = s.split(" ");
        s = "";
        for(String i : a){
            s += i.substring(0, 1).toUpperCase() + 
                    i.substring(1).toLowerCase() + " ";
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SV[] a = new SV[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new SV();
        for(int j = 1 ; j <= n ; ++j){
            String s = "B20DCCN00";
            if(j < 10)
                s += j;
            else
                s = s.substring(0, 8) + j;
            a[j-1].code = s;
            for(int i = 1 ; i <= 4 ; ++i)
            {
                s = sc.nextLine();
                if(i % 4 == 1)
                    a[j-1].name = standard(s);
                if(i % 4 == 2)
                    a[j-1].lp = s;
                if(i % 4 == 3)
                    a[j-1].dob = convert(s);
                if(i % 4 == 0)
                    a[j-1].gpa = Double.parseDouble(s);
            }
        }
        for(int i = 0 ; i < n ; ++i)
        {
            System.out.print(a[i].code+" "+a[i].name+" "+
                    a[i].lp+" "+a[i].dob+" ");
            System.out.printf("%.2f\n", a[i].gpa);
        }
    }
}
