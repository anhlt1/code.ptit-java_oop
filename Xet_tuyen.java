package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Xet_tuyen {
    public static class PH{
        String name, dob, rank, code;
        double dlt, dt;
        int tb, age;

        public PH(String name, String dob, double a, double b, int i) {
            name = name.trim();
            name = name.replaceAll("\\s+", " ");
            String[] c = name.split(" ");
            name = "";
            for(String e : c)
                name += e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase() + " ";
            name = name.substring(0, name.length()-1);
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
            if(dob.charAt(1) == '/')
                dob = "0" + dob;
            if(dob.charAt(4) == '/')
                dob = dob.substring(0, 3) + "0" + dob.substring(3);
            this.dob = dob;
            age = 2021 - Integer.parseInt(dob.substring(6));
        }

        @Override
        public String toString() {
            return code + " " + name + " " + age + 
                    " " + tb + " " + rank;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<PH> a = new ArrayList<>();
        int i = 0;
        while (t --> 0) {
            a.add(new PH(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), ++i));
            sc.nextLine();
        }
        for(PH e : a)
            System.out.println(e);
    }
}
