package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

public class Tinh_tien_dien {

    public static class TD{

        String sD, maKH;
        int chiSoCu, chiSoMoi, heSo, thanhtien,phuTroi, tongTien;

        public TD(int sTT, String sD, int chiSoCu, int chiSoMoi) {
            this.maKH = "KH" + String.format("%02d", sTT);
            this.chiSoCu = chiSoCu;
            this.chiSoMoi = chiSoMoi;
            this.heSo = tinhHeSo(sD);
            this.thanhtien = (chiSoMoi-chiSoCu)*this.heSo*550;
            this.phuTroi = tinhPhuTroi(chiSoMoi, chiSoCu, this.thanhtien);
            this.tongTien = this.phuTroi + this.thanhtien;
        }

        public int getTongTien() {
            return tongTien;
        }
        
        private static int tinhHeSo(String sD){
            if(sD.equals("KD"))
                return 3;
            else if(sD.equals("NN"))
                return 5;
            else if(sD.equals("TT"))
                return 4;
            else
                return 2;
        }
        private static int tinhPhuTroi(int chiSoMoi, int chiSoCu, int thanhTien){
            int chiSo = chiSoMoi-chiSoCu;
            if(chiSo < 50)
                return 0;
            else if(chiSo <= 100){
                float x = (float) (thanhTien * 0.35);
                x = Math.round(x);
                return (int) (x);
            }
            else{
                return thanhTien;
            }
                
        }

        @Override
        public String toString() {
            return maKH + " " + heSo + " " + thanhtien + " " + phuTroi + " " + tongTien ;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<TD> listTD = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            listTD.add(new TD(i, in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
//        listTD.sort(Comparator.comparing(TD::getTongTien).reversed());
        for (TD tienDien : listTD) {
            System.out.println(tienDien);
        }
    }
}
