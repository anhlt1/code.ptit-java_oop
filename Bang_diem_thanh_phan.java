package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class SV{
    String code, name, lp;
    float d1, d2, d3;

    public SV() {
    }
    
}

public class Bang_diem_thanh_phan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        SV[] a = new SV[n];
        for(int i = 0 ; i < n ;++i)
            a[i] = new SV();
        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = 1 ; j <= 6 ; ++j)
            {
                if(j % 6 == 1)
                {
                    a[i].code = sc.nextLine();
                }
                if(j % 6 == 2)
                {
                    a[i].name = sc.nextLine();
                }
                if(j % 6 == 3)
                {
                    a[i].lp = sc.nextLine();
                }
                if(j % 6 == 4)
                {
                    float tmp = sc.nextFloat();
                    a[i].d1 = tmp;
                }
                if(j % 6 == 5)
                {
                    a[i].d2 = sc.nextFloat();
                }
                if(j % 6 == 0)
                {
                    a[i].d3 = sc.nextFloat();
                    sc.nextLine();
                }
            }
        }
        List<SV> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (SV x, SV y) -> x.name.compareTo(y.name));
        int o = 0;
        for(SV i : arr){
            o++;
            System.out.print(o+" "+i.code+" "+i.name+" "+i.lp+" ");
            System.out.printf("%.1f ", i.d1);
            System.out.printf("%.1f ", i.d2);
            System.out.printf("%.1f ", i.d3);
            System.out.println();
        }
    }
}