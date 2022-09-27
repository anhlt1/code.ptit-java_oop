package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Sap_xep_mat_hang {
    public static class MH{
        String code, name, group;
        float gm, gb;

        public MH() {
        }
        
        public float getPrice(){
            return gb-gm;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + group + " " +
                    String.format("%.2f", gb - gm);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MATHANG.in");
        Scanner sc = new Scanner(f);
        int n = 0;
        while(sc.hasNext()){
            n = Integer.parseInt(sc.nextLine());
            break;
        }
        MH[] a= new MH[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new MH();
        int i = 0, j = 0;
        while(sc.hasNext()){
            j++;
            if(j % 4 == 1)
                a[i].name = sc.nextLine();
            if(j % 4 == 2)
                a[i].group = sc.nextLine();
            if(j % 4 == 3)
                a[i].gm = sc.nextFloat();
            if(j % 4 == 0)
            {
                a[i].gb = sc.nextFloat();
                sc.nextLine();
                a[i].code = "MH" + String.format("%02d", i+1);
                i++;
            }
        }
        List<MH> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        arr.sort(Comparator.comparing(MH::getPrice).reversed());
        for(MH e : arr)
            System.out.println(e);
    }
}
