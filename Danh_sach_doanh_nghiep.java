package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
class Corp {

    String code, name;
    int num;

    public Corp() {
    }
}

public class Danh_sach_doanh_nghiep {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DN.in");
        Scanner sc = new Scanner(f);
        int n = 0;
        while (sc.hasNext()) {
            n = Integer.parseInt(sc.nextLine());
            break;
        }
        List<Corp> arr = new ArrayList<>();
        Corp[] a = new Corp[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new Corp();
        int i = 0;
        int j = 0;
        String s = "";
        while (sc.hasNext()) {
            ++j;
            s = sc.nextLine();
            if (j % 3 == 1) {
                a[i].code = s;
            }
            if (j % 3 == 2) {
                a[i].name = s;
            }
            if (j % 3 == 0) {
                a[i].num = Integer.parseInt(s);
                ++i;
            }
        }
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (Corp x, Corp y) -> x.code.compareTo(y.code));
        for (Corp e : arr) {
            System.out.println(e.code + " " + e.name + " " + e.num);
        }
    }
}
