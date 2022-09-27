package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Xep_loai {
    public static class SV{
        String name, code, diemTB, rank;
        int d1, d2, d3;
        double tb;

        public SV() {
        }

        public double getTb() {
            return tb;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + diemTB + " " + rank;
        }
        
    }
    
    public static String setName(String name) {
            name = name.trim();
            name = name.replaceAll("\\s+", " ");
            String[] c = name.split(" ");
            name = "";
            for(String e : c)
                name += e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase() + " ";
            name = name.substring(0, name.length()-1);
            return name;
        }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = 0;
        
        while(sc.hasNext())
        {
            n = Integer.parseInt(sc.nextLine());
            break;
        }
        
        SV[] a = new SV[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new SV();
        
        int i = 0;
        int j = 0;
        while(sc.hasNext()){
            j++;
            if(j % 4 == 1)
                a[i].name = setName(sc.nextLine());
            if(j % 4 == 2)
                a[i].d1 = sc.nextInt();
            if(j % 4 == 3)
                a[i].d2 = sc.nextInt();
            if(j % 4 == 0)
            {
                a[i].d3 = sc.nextInt();
                a[i].code = "SV" + String.format("%02d", i + 1);
                a[i].tb = a[i].d1 * 0.25 + a[i].d2 * 0.35 + a[i].d3 * 0.4;
                a[i].diemTB = String.format("%.2f", a[i].tb);
                sc.nextLine();
                ++i;
            }
        }
        
        List<SV> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        arr.sort(Comparator.comparing(SV::getTb).reversed());
        
        for(SV e : arr){
            double res = e.tb;
            if(res >= 8)
                e.rank = "GIOI";
            else if(res >= 6.5)
                e.rank = "KHA";
            else if(res >= 5)
                e.rank = "TRUNG BINH";
            else
                e.rank = "KEM";
        }
        
        for(SV e : arr)
            System.out.println(e);
    }
}
