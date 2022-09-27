package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Liet_ke_nhap_xuat_hang_theo_nhom {
    public static class MH{
        String ma;
        int slNhap, slXuat, donGia, tien, thue;

        public MH(String ma, int slNhap) {
            this.ma = ma;
            this.slNhap = slNhap;
            if(ma.charAt(0) == 'A')
                slXuat = (int) Math.round((float) (slNhap * 0.6));
            else
                slXuat = (int) Math.round((float) (slNhap * 0.7));
            if(ma.charAt(ma.length() - 1) == 'Y')
                donGia = 110000;
            else
                donGia = 135000;
            tien = slXuat * donGia;
            char x = ma.charAt(0);
            char y = ma.charAt(ma.length()-1);
            if(x == 'A' && y == 'Y')
                thue = (int) (0.08 * tien);
            else if(x == 'A' && y == 'N')
                thue = (int) (0.11 * tien);
            else if(x == 'B' && y == 'Y')
                thue = (int) (0.17 * tien);
            else
                thue = (int) (0.22 * tien);
        }

        public int getThue() {
            return thue;
        }

        @Override
        public String toString() {
            return ma + " " + slNhap + " " + slXuat
                    + " " + donGia + " " + tien + 
                    " " + thue;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<MH> a = new ArrayList<>();
        while(t --> 0){
            String ma = sc.nextLine();
            int nhap = sc.nextInt();
            sc.nextLine();
            a.add(new MH(ma, nhap));
        }
        a.sort(Comparator.comparing(MH::getThue).reversed());
        String c = sc.nextLine();
        for(MH i : a)
            if(c.charAt(0) == i.ma.charAt(0))
            System.out.println(i);
    }
}
