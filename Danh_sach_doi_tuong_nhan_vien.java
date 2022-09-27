package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class NV{
    String name, gender, dob, addr, taxcode, doc, code;

    public NV() {
    }

    public NV(String name, String gender, String dob, String addr, String taxcode, String doc) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.addr = addr;
        this.taxcode = taxcode;
        this.doc = doc;
    }
    
    
}

public class Danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NV[] a = new NV[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new NV();
        for(int j = 1 ; j <= n ; ++j)
        {
            String ma = "0000";
            if(j < 10)
                ma += j;
            else
                ma = ma.substring(0, 3) + j;
            a[j - 1].code = ma;
            for(int i = 1 ; i <= 6 ; ++i)
            {
                String s = sc.nextLine();
                if(i % 6 == 1)
                    a[j - 1].name = s;
                if(i % 6 == 2)
                    a[j - 1].gender = s;
                if(i % 6 == 3)
                    a[j - 1].dob = s;
                if(i % 6 == 4)
                    a[j - 1].addr = s;
                if(i % 6 == 5)
                    a[j - 1].taxcode = s;
                if(i % 6 == 0)
                    a[j - 1].doc = s;
            }
        }
        for(NV i : a)
            System.out.println(i.code+" "+i.name+" "+i.gender+" "+i.dob+" "
            +i.addr+" "+i.taxcode+" "+i.doc);
    }
}
