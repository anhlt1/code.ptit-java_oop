package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
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

public class Sap_xep_theo_ma_sinh_vien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Vector<String> v = new Vector<>();
        while(sc.hasNextLine()){
            v.add(sc.nextLine());
        }
        int n = v.size();
        SV[] a = new SV[n/4];
        for(int i = 0 ; i < n/4 ; ++i)
            a[i] = new SV();
        String[] b = v.toArray(new String[n]);
        int t = -1;
        for(int i = 0 ; i < n/4 ; ++i)
            for(int j = 1 ; j <= 4 ; ++j)
            {
                ++t;
                String s = b[t];
                if(j % 4 == 1)
                    a[i].code = s;
                else if(j % 4 == 2)
                    a[i].name = s;
                else if(j % 4 == 3)
                    a[i].lp = s;
                else
                    a[i].mail = s;
            }
        List<SV> svien = new ArrayList<>();
        svien.addAll(Arrays.asList(a));
        Collections.sort(svien, (SV x, SV y) -> {
            return x.code.compareTo(y.code);
        });
        for(SV i : svien)
            System.out.println(i.code+" "+i.name+" "+i.lp+" "+
                    i.mail);
    }
}
