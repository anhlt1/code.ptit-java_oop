package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Xep_hang_hoc_sinh {
    public static class HS{
        String name, code, xepLoai;
        int xepHang;
        double gpa;

        public HS(String name, double gpa, int i) {
            this.name = name;
            this.gpa = gpa;
            this.code = "HS" + String.format("%02d", i);
            if(this.gpa >= 9)
                xepLoai = "Gioi";
            else if(this.gpa >= 7)
                xepLoai = "Kha";
            else if(this.gpa >= 5)
                xepLoai = "Trung Binh";
            else
                xepLoai = "Yeu";
        }

        public double getGpa() {
            return gpa;
        }

        public String getCode() {
            return code;
        }

        @Override
        public String toString() {
            return code + " " + name + " " +
                    String.format("%.1f", gpa) + " " +
                    xepLoai + " " + xepHang;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<HS> a = new ArrayList<>();
        int i = 0;
        while(t --> 0){
            String name = sc.nextLine();
            Double gpa = sc.nextDouble();
            sc.nextLine();
            a.add(new HS(name, gpa, ++i));
        }
        HashSet<Double> set = new HashSet<>();
        a.sort(Comparator.comparing(HS::getGpa).reversed());
        i = 0;
        int j = 0;
        for(HS e : a){
            ++j;
            if(set.contains(e.gpa))
            {
                e.xepHang = i;
            }
            else {
                e.xepHang = j;
                i = j;
                set.add(e.gpa);
            }
        }
        a.sort(Comparator.comparing(HS::getCode));
        for(HS e : a)
            System.out.println(e);
    }
}
