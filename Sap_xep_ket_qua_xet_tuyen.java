package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Sap_xep_ket_qua_xet_tuyen {
    public static class PH{
        String name, dob, rank, code;
        double dlt, dt;
        int tb, age;

        public PH(String name, String dob, double a, double b, int i) {
            this.name = name;
            this.dob = dob;
            if(a >= 8 && b >= 8)
                dt = 1;
            else if(a >= 7.5 && b >= 7.5)
                dt = 0.5;
            else
                dt = 0;
            double sum = (a + b) / 2.0 + dt;
            if(sum > 10)
                tb = 10;
            else {
                tb = (int) Math.round(sum);
            }
            if(tb >= 9)
                rank = "Xuat sac";
            else if (tb >= 8)
                rank = "Gioi";
            else if(tb >= 7)
                rank = "Kha";
            else if(tb >= 5)
                rank = "Trung binh";
            else 
                rank = "Truot";
            code = "PH" + String.format("%02d", i);
            age = 2021 - Integer.parseInt(dob.substring(6));
        }

        @Override
        public String toString() {
            return code + " " + name + " " + age + 
                    " " + tb + " " + rank;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<PH> a = new ArrayList<>();
        int i = 0;
        while (t --> 0) {
            a.add(new PH(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), ++i));
            sc.nextLine();
        }
        Collections.sort(a, new Comparator<PH>(){
            public int compare(PH x, PH y){
                if(x.tb != y.tb)
                    return Integer.compare(y.tb, x.tb);
                return x.code.compareTo(y.code);
            }
        });
        for(PH e : a)
            System.out.println(e);
    }
}
