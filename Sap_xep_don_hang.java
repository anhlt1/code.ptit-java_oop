package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Sap_xep_don_hang {
    public static class DH{
        String name, code, soTT;
        int donGia, soLuong, discount, thanhTien;

        public DH(String name, String code, int donGia, int soLuong) {
            this.name = name;
            this.code = code;
            this.donGia = donGia;
            this.soLuong = soLuong;
            if(code.charAt(code.length() - 1) == '1')
                this.discount = donGia * soLuong / 100 * 50;
            else
                this.discount = donGia * soLuong / 100 * 30;
            this.soTT = code.substring(1, 4);
            this.thanhTien = donGia * soLuong - this.discount;
        }

        public String getSoTT() {
            return soTT;
        }

        @Override
        public String toString() {
            return name + " " + code + " " + soTT +
                    " " + discount + " " + thanhTien;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DH> a = new ArrayList<>();
        while(t --> 0){
            String name = sc.nextLine();
            String code = sc.nextLine();
            int don = sc.nextInt();
            int sl = sc.nextInt();
            sc.nextLine();
            a.add(new DH(name, code, don, sl));
        }
        a.sort(Comparator.comparing(DH::getSoTT));
        for(DH i : a)
            System.out.println(i);
    }
}
