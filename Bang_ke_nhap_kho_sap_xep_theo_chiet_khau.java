package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Bang_ke_nhap_kho_sap_xep_theo_chiet_khau {
    static HashMap<String, Integer> m = new HashMap<>();
    public static class MH{
        String name, code, maHang;
        int soLuong, donGia, chietKhau, thanhTien;
        double phanTram;

        public MH(String name, int soLuong, int donGia) {
            this.name = name;
            String[] a = name.split(" ");
            this.code = a[0].substring(0, 1).toUpperCase() + a[1].substring(0, 1).toUpperCase();
            if(m.containsKey(this.code))
            {
                m.put(code, m.get(code) + 1);
                maHang = this.code + "0" + m.get(this.code);
            }
            else {
                m.put(code, 1);
                maHang = this.code + "01";
            }
            if(soLuong > 10)
                phanTram = 0.05;
            else if(soLuong >= 8)
                phanTram = 0.02;
            else if(soLuong >= 5)
                phanTram = 0.01;
            else
                phanTram = 0;
            chietKhau = (int) (donGia * soLuong * phanTram);
            thanhTien = donGia * soLuong - chietKhau;
        }

        public int getChietKhau() {
            return chietKhau;
        }

        @Override
        public String toString() {
            return maHang + " " + name + " " + 
                    chietKhau + " " + thanhTien;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        List<MH> a = new ArrayList<>();
        while(t --> 0)
        {
            String name = sc.nextLine();
            int soLuong = sc.nextInt();
            int donGia = sc.nextInt();
            sc.nextLine();
            a.add(new MH(name, soLuong, donGia));
        }
        a.sort(Comparator.comparing(MH::getChietKhau).reversed());
        for(MH i : a)
            System.out.println(i);
    }
}
