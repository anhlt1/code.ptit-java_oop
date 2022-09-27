package java_oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anhla
 */

class NV{
    String name, gender, dob, addr, taxcode, doc, code;
    int y, m, d;

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

public class Sap_xep_danh_sach_doi_tuong_nhan_vien {
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
                {
                    a[j - 1].dob = s;
                    String[] t = a[j - 1].dob.split("/");
                    a[j - 1].d = Integer.parseInt(t[0]);
                    a[j - 1].m = Integer.parseInt(t[1]);
                    a[j - 1].y = Integer.parseInt(t[2]);
                }
                if(i % 6 == 4)
                    a[j - 1].addr = s;
                if(i % 6 == 5)
                    a[j - 1].taxcode = s;
                if(i % 6 == 0)
                    a[j - 1].doc = s;
            }
        }
        List<NV> nvien = new ArrayList<>();
        nvien.addAll(Arrays.asList(a));
        Collections.sort(nvien, (NV x, NV y) -> {
            if(x.y != y.y)
                return Integer.compare(x.y, y.y);
            if(x.m != y.m)
                return Integer.compare(x.m, y.m);
            if(x.d != y.d)
                return Integer.compare(x.d, y.d);
            return 1;
        });
        for(NV i : nvien)
            System.out.println(i.code+" "+i.name+" "+i.gender+" "+i.dob+" "
            +i.addr+" "+i.taxcode+" "+i.doc);
    }
    
}
