package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Danh_sach_trung_tuyen {
    public static class TS{
        String code, name, status;
        double d1, d2, d3, uuTien, tongDiem;

        public TS(String code, String name,  double d1, double d2, double d3) {
            this.code = code;
            name = name.trim();
            name = name.replaceAll("\\s+", " ");
            String[] c = name.split(" ");
            name = "";
            for(String e : c)
                name += e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase() + " ";
            name = name.substring(0, name.length()-1);
            this.name = name;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            if(code.charAt(2) == '1')
                uuTien = 0.5;
            else if(code.charAt(2) == '2')
                uuTien = 1.0;
            else
                uuTien = 2.5;
            tongDiem = d1 * 2 + d2 + d3 + uuTien;
        }

        public void setStatus(double tongDiem) {
            if(this.tongDiem >= tongDiem)
                status = "TRUNG TUYEN";
            else
                status = "TRUOT";
        }

        public double getTongDiem() {
            return tongDiem;
        }

        @Override
        public String toString() {
            return  + uuTien + " " + 
                    tongDiem + " " + status;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<TS> a = new ArrayList<>();
        while(t --> 0)
        {
            a.add(new TS(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        int chiTieu = sc.nextInt();
        a.sort(Comparator.comparing(TS::getTongDiem).reversed());
        double diemChuan = a.get(chiTieu - 1).tongDiem;
        for(TS i : a)
            i.setStatus(diemChuan);
        System.out.println(diemChuan);
        for(TS i : a)
        {
            System.out.print(i.code + " " + i.name + " ");
            if(i.uuTien % 1 != 0)
                System.out.printf("%.1f ", i.uuTien);
            else
                System.out.print((int)i.uuTien + " ");
            if(i.tongDiem % 1 != 0)
                System.out.printf("%.1f ", i.tongDiem);
            else
                System.out.print((int)i.tongDiem + " ");
            System.out.println(i.status);
        }
    }
}
