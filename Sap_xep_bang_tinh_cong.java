package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Sap_xep_bang_tinh_cong {
    public static class NV{
        String name, pos, code;
        int days, luongNgay, luongThang, thuong, phuCap, thucLinh;

        public NV() {
        }

        public NV(int t, String name, int sal, int days, String pos) {
            this.name = name;
            this.pos = pos;
            this.luongNgay = sal;
            this.days = days;
            this.code = "NV" + String.format("%02d", t + 1);
            this.luongThang = this.luongNgay * this.days;
            if(this.days >= 25)
                thuong = luongThang / 5;
            else if(this.days >= 22)
                thuong = luongThang / 10;
            else
                thuong = 0;
            switch (pos) {
                case "GD":
                    phuCap = 250000;
                    break;
                case "PGD":
                    phuCap = 200000;
                    break;
                case "TP":
                    phuCap = 180000;
                    break;
                default:
                    phuCap = 150000;
                    break;
            }
            thucLinh = luongThang + thuong + phuCap;
        }

        public int getThucLinh() {
            return thucLinh;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + 
                    luongThang + " " + thuong + " " + 
                    phuCap + " " + thucLinh;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<NV> a = new ArrayList<>();
        
        for(int i = 0 ; i < n ; ++i){
            String name = sc.nextLine();
            int luongNgay = sc.nextInt();
            int day = sc.nextInt();
            sc.nextLine();
            String pos = sc.nextLine();
            a.add(new NV(i, name, luongNgay, day, pos));
        }
        
        a.sort(Comparator.comparing(NV::getThucLinh).reversed());
        
        for(NV i : a)
        {
            System.out.println(i);
        }
    }
}
