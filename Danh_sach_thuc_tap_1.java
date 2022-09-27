package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class SV{
    String code, name, lp, mail, corp;
    int ord;

    public SV() {
    }
}

public class Danh_sach_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        SV[] a = new SV[n];
        for(int i = 0 ; i < n ;++i)
        {
            a[i] = new SV();
        }
        for(int i = 0 ; i < n ;++i){
            a[i].ord = i + 1;
            for(int j = 1 ; j <= 5 ; ++j)
            {
                String s = sc.nextLine();
                if(j % 5 == 1)
                {
                    a[i].code = s;
                }
                if(j % 5 == 2)
                {
                    a[i].name = s;
                }
                if(j % 5 == 3)
                {
                    a[i].lp = s;
                }
                if(j % 5 == 4)
                {
                    a[i].mail = s;
                }
                if(j % 5 == 0)
                {
                    a[i].corp = s;
                }
            }
        }
        List<SV> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (SV x, SV y) -> x.code.compareTo(y.code));
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            String str = sc.nextLine();
            for(SV i : arr){
                if(str.equals(i.corp))
                    System.out.println(i.ord+" "+i.code+" "+i.name+" "+i.lp+" "+i.mail+" "+i.corp);
            }
        }
    }
}
