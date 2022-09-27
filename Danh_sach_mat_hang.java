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

class MH{
    
    String name, donvi, code;
    int giamua, giaban;

    public MH() {
    }

    public MH(String name, String donvi, int giamua, int giaban) {
        this.name = name;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    
    
    
}

public class Danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MH[] a = new MH[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new MH();
        for(int i = 1 ; i <= n ; ++i)
        {
            String ma = "MH00";
            if(i < 10)
                ma += i;
            else
                ma = ma.substring(0, 3) + i;
            a[i-1].code = ma;
            for(int j = 1 ; j <= 4 ; ++j)
            {
                String s = sc.nextLine();
            if( j % 4 == 1 )
                a[i-1].name = s;
            if( j % 4 == 2 )
                a[i-1].donvi = s;
            if( j % 4 == 3 )
                a[i-1].giamua = Integer.parseInt(s);
            if( j % 4 == 0)
                a[i-1].giaban = Integer.parseInt(s);
            }
        }
        List<MH> monhoc = new ArrayList<>();
        monhoc.addAll(Arrays.asList(a));
        Collections.sort(monhoc, (MH x, MH y) -> {
            if(x.giaban - x.giamua != y.giaban - y.giamua)
                return Integer.compare(y.giaban - y.giamua, x.giaban - x.giamua);
            return x.code.compareTo(y.code);
        });
        for(MH i : monhoc)
            System.out.println(i.code+" "+i.name+" "
            +i.donvi+" "+i.giamua+" "+i.giaban+" "
            +(i.giaban - i.giamua));
    }
}
