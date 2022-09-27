package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class MH{
    
    String name, group;
    double giamua, giaban, loi;
    int code;

    public MH() {
    }
    
}

public class Sap_xep_danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MH[] a = new MH[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new MH();
        for(int i = 0 ; i < n ; ++i)
        {
            a[i].code = i + 1;
            for(int j = 1 ; j <= 4 ; ++j)
            {
                String s = "";
                if(j % 4 == 1)
                {
                    s = sc.nextLine();
                    a[i].name = s;
                }
                if(j % 4 == 2)
                {
                    s = sc.nextLine();
                    a[i].group = s;
                }
                if(j % 4 == 3)
                {
                    a[i].giamua = sc.nextDouble();
                }
                if(j % 4 == 0)
                {
                    a[i].giaban = sc.nextDouble();
                    a[i].loi = a[i].giaban - a[i].giamua;
                    sc.nextLine();
                }
            }
        }
        List<MH> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (MH x, MH y) -> Double.compare(y.loi, x.loi));
        for(MH i : arr)
        {
            System.out.print(i.code+" "+i.name+" "+i.group+" ");
            System.out.printf("%.2f\n", i.loi);
        }
    }
}
