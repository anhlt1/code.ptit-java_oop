package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Sap_xep_ket_qua_tuyen_sinh {
    public static class TS{
        String code, name, status;
        double d1, d2, d3, uuTien, tongDiem;

        public TS(String code, String name,  double d1, double d2, double d3) {
            this.code = code;
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
            if(tongDiem >= 24)
                status = "TRUNG TUYEN";
            else
                status = "TRUOT";
        }

        public double getTongDiem() {
            return tongDiem;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<TS> a = new ArrayList<>();
        while(t --> 0)
        {
            a.add(new TS(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        a.sort(Comparator.comparing(TS::getTongDiem).reversed());
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
