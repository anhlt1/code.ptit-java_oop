package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Liet_ke_nhan_vien_theo_chuc_vu {
    public static class NV{
        String name, pos, code;
        int days, luongCB, phuCap, luongChinh, tamUng, remains;

        public NV() {
        }

        public NV(int t, String name, String pos, int luong, int ngay) {
            this.name = name;
            this.pos = pos;
            this.luongCB = luong;
            this.days = ngay;
            this.code = "NV" + String.format("%02d", t + 1);
            
            switch (pos) {
                case "GD":
                    phuCap = 500;
                    break;
                case "PGD":
                    phuCap = 400;
                    break;
                case "TP":
                    phuCap = 300;
                    break;
                case "KT":
                    phuCap = 250;
                    break;
                default:
                    phuCap = 100;
                    break;
            }
            luongChinh = days * luongCB;
            float tmp = (phuCap + luongChinh) * 2 / 3;
            if( tmp < 25000.0)
                tamUng = 1000 * (int) Math.round(tmp / 1000.0);
            else
                tamUng = 25000;
            remains = luongChinh - tamUng + phuCap;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + 
                    phuCap + " " + luongChinh + " " + 
                    tamUng + " " + remains;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<NV> a = new ArrayList<>();
        
        for(int i = 0 ; i < n ; ++i){
            String name = sc.nextLine();
            String pos = sc.nextLine();
            int luong = sc.nextInt();
            int day = sc.nextInt();
            sc.nextLine();
            a.add(new NV(i, name, pos, luong, day));
        }
        
        String s = sc.nextLine();
        
        for(NV i : a)
            if(i.pos.equals(s))
                System.out.println(i);
    }
}
