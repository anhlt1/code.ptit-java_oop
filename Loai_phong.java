package java_oop;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Loai_phong {

    public static class LoaiPhong implements Comparable<LoaiPhong> {

        String kh, name, price, service;

        public LoaiPhong() {
        }

        public LoaiPhong(String s) {
            String[] a = s.split(" ");
            this.kh = a[0];
            this.name = a[1];
            this.price = a[2];
            this.service = a[3];
        }

        @Override
        public int compareTo(LoaiPhong o) {
            if (this.name.compareTo(o.name) >= 0) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return kh + " " + name + " "
                    + price + " " + service;
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}
