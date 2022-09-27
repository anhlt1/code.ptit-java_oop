package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
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

class MT{

    String code, name, form;

    public MT() {
        code = name = form = "";
    }

    public MT(String code, String name, String form) {
        this.code = code;
        this.name = name;
        this.form = form;
    }

    public String getCode() {
        return code;
    }
    
}

public class Danh_sach_mon_thi {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        MT[] a = new MT[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new MT();
        int t = 0;
        n = -1;
        while(sc.hasNextLine())
        {
            t++;
            String s = sc.nextLine();
            if(t % 3 == 1)
            {
                ++n;
                a[n].code = s;
            }
            else if(t % 3 == 2){
                a[n].name = s;
            }
            else {
                a[n].form = s;
            }
        }
        List<MT> monthi = new ArrayList<>();
        for(MT i : a)
            monthi.add(i);
        Collections.sort(monthi, new Comparator<MT>(){
            public int compare(MT a, MT b){
                return a.getCode().compareTo(b.getCode());
            }
        });
        for(MT i : monthi)
            System.out.println(i.code + " " + i.name + " " + i.form);
    }
}