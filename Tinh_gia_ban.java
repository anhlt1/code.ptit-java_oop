package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class MH{
    String name, dvi, code;
    double gnhap, sluong, phivc, thtien, gban;

    public MH() {
    }
}

public class Tinh_gia_ban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        MH[] a = new MH[n];
        for(int i =0 ; i < n ; ++i)
            a[i] = new MH();
        String s = "";
        for(int i = 0 ; i < n ; ++i)
        {
            if(i < 9)
                s = "MH0" + (i + 1);
            else
                s = "MH" + (i + 1);
            a[i].code = s;
            for(int j = 1 ; j <= 4 ; ++j)
            {
                if(j % 4 == 1)
                    a[i].name = sc.nextLine();
                if(j % 4 == 2)
                    a[i].dvi = sc.nextLine();
                if(j % 4 == 3)
                    a[i].gnhap = sc.nextDouble();
                if(j % 4 == 0)
                {
                    a[i].sluong = sc.nextDouble();
                    sc.nextLine();
                }
            }
            a[i].phivc = (int) ((a[i].gnhap * a[i].sluong) * 0.05);
            a[i].thtien = (int) a[i].gnhap * a[i].sluong + a[i].phivc;
            a[i].gban = (int) (a[i].thtien + a[i].thtien * 0.02);
        }
//        List<MH> arr = new ArrayList<>();
//        arr.addAll(Arrays.asList(a));
//        Collections.sort(arr, (MH x, MH y) -> Integer.compare(y.gban, x.gban));
        for(MH i : a){
            System.out.println(i.code+" "+i.name+" "+i.dvi+" "+i.phivc
            +" "+i.thtien+" "+i.gban);
        }
    }
}
