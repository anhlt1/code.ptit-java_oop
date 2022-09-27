package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Tinh_tien_dien_file {

    public static class KH {

        String name, type, code;
        int dinhMuc, fid, sid, dm, vdm, tong, vat;
        static int i = 0;

        public KH(String name, String s) {
            this.code = "KH" + String.format("%02d", ++i);
            this.name = name;
            String[] a = s.split(" ");
            this.type = a[0];
            this.fid = Integer.parseInt(a[1]);
            this.sid = Integer.parseInt(a[2]);
            int diff = sid - fid;
            if(type.equals("A")) dinhMuc = 100;
            else if(type.equals("B")) dinhMuc = 500;
            else dinhMuc = 200;
            dm = Math.min(diff, dinhMuc) * 450;
            vdm = Math.max(diff - dinhMuc, 0) * 1000;
            vat = (vdm / 20);
            tong = dm + vdm + vat;
        }

        public int getTong() {
            return tong;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + dm + " " + vdm + " "
                   + vat + " " + tong;
        }
    }

    public static String setName(String s) {
        s = s.trim();
        while(s.contains("  "))
            s = s.replace("  ", " ");
        String[] c = s.split(" ");
        s = "";
        for (String e : c) {
            if(e.length() > 0)
                s += e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase() + " ";
        }
        s = s.substring(0, s.length() - 1);
        return s;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List<KH> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; ++i) {
            a.add(new KH(setName(sc.nextLine()), sc.nextLine()));
        }
        a.sort(Comparator.comparing(KH::getTong).reversed());
        for (KH e : a) {
            System.out.println(e);
        }
    }
}
