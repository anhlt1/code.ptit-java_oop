package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class Corp{
    String code, name;
    int num;

    public Corp() {
    }
}

public class Danh_sach_sinh_vien_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Corp[] a = new Corp[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new Corp();
        String s = "";
        for(int i = 0 ; i < n ; ++i)
        {
            for(int j = 1 ; j <= 3 ; ++j)
            {
                s = sc.nextLine();
                if(j % 3 == 1)
                    a[i].code = s;
                if(j % 3 == 2)
                    a[i].name = s;
                if(j % 3 == 0)
                    a[i].num = Integer.parseInt(s);
            }
        }
        List<Corp> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (Corp x, Corp y) -> {
            if(x.num != y.num)
                return Integer.compare(y.num, x.num);
            else
                return x.code.compareTo(y.code);
        });
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0)
        {
            int l = sc.nextInt();
            int h = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+l+" DEN "+h+" SINH VIEN:");
            for(Corp i : arr)
                if(i.num >= l && i.num <= h)
                    System.out.println(i.code+" "+i.name+" "+i.num);
        }
    }
}
