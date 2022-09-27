package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class SV{
    String code, name, lp, mail;

    public SV() {
    }

    public SV(String code, String name, String lp, String mail) {
        this.code = code;
        this.name = name;
        this.lp = lp;
        this.mail = mail;
    }
    
}

public class Liet_ke_sinh_vien_theo_lop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SV[] a = new SV[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new SV();
        String s;
        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = 1 ; j <= 4 ; ++j)
            {
                s = sc.nextLine();
                if(j % 4 == 1)
                    a[i].code = s;
                else if(j % 4 == 2)
                    a[i].name = s;
                else if(j % 4 == 3)
                    a[i].lp = s;
                else
                    a[i].mail = s;
            }
        }
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0)
        {
            s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH "+s+":");
            for(SV i : a)
                if(i.lp.equals(s))
                    System.out.println(i.code+" "+i.name+" "+i.lp+" "+i.mail);
        }
    }
}
