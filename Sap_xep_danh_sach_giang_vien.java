package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class GV{
    String name, ten, code, sub;

    public GV() {
    }
    
}

public class Sap_xep_danh_sach_giang_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GV[] a = new GV[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new GV();
        String s = "";
        for(int i = 0 ; i < n ;++i)
        {
            s = "GV0";
            if(i+1 < 10)
                s += (i+1);
            else
                s = s.substring(0, 2) + (i + 1);
            a[i].code = s;
            for(int j = 1 ; j <= 2 ; ++j)
            {
                s = sc.nextLine();
                if(j == 1)
                {
                    a[i].name = s;
                    String[] tmp = s.split(" ");
                    a[i].ten = tmp[tmp.length-1];
                }
                else
                {
                    String[] tmp = s.split(" ");
                    s = "";
                    for(String e : tmp){
                        s += Character.toUpperCase(e.charAt(0));
                    }
                    a[i].sub = s;
                }
            }
        }
        List<GV> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (GV x, GV y) -> {
            if(!x.ten.equals(y.ten))
                return x.ten.compareTo(y.ten);
            else
                return x.code.compareTo(y.code);
        });
        for(GV i : arr)
            System.out.println(i.code+" "+i.name+" "+i.sub);
    }
}
