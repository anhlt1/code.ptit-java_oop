package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Danh_sach_sinh_vien_trong_file_1 {

    static class SV {

        String code, name, lp, mail;

        public SV() {
        }

        @Override
        public String toString() {
            return code + " " + name + " " + lp + " " + mail;
        }

    }
    
    public static String standard(String s){
        s = s.trim();
        while(s.contains("  "))
            s = s.replace("  ", " ");
        String[] a = s.split(" ");
        s = "";
        for(String i : a){
            s += i.substring(0, 1).toUpperCase() + 
                    i.substring(1).toLowerCase() + " ";
        }
        return s;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f);
        int n = 0;
        while (sc.hasNext()) {
            n = Integer.parseInt(sc.nextLine());
            break;
        }
        List<SV> arr = new ArrayList<>();
        SV[] a = new SV[n];
        for (int i = 0; i < n; ++i) {
            a[i] = new SV();
        }
        int i = 0;
        int j = 0;
        String s = "";
        while (sc.hasNext()) {
            ++j;
            s = sc.nextLine();
            if (j % 4 == 1) {
                a[i].code = s;
            }
            if (j % 4 == 2) {
                a[i].name = standard(s);
            }
            if (j % 4 == 3) {
                a[i].lp = s;
            }
            if (j % 4 == 0){
                a[i].mail = s;
                ++i;
            }
        }
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (SV x, SV y) -> x.code.compareTo(y.code));
        for (SV e : arr) {
            System.out.println(e);
        }
    }
}
