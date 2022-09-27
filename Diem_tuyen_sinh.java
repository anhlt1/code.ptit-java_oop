package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Diem_tuyen_sinh {
    
    public static class TS{
        String name, dt, code, status;
        double diemThi, uuTien, tong;
        int kv;

        @Override
        public String toString() {
            return code + " " + name + " " + tong + " " + status;
        }
    }

    public static String setName(String name) {
        name = name.trim();
        name = name.replaceAll("\\s+", " ");
        String[] c = name.split(" ");
        name = "";
        for (String e : c) {
            name += e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase() + " ";
        }
        name = name.substring(0, name.length() - 1);
        return name;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = 0;

        while (sc.hasNext()) {
            n = Integer.parseInt(sc.nextLine());
            break;
        }

        TS[] a = new TS[n];
        for (int i = 0; i < n; ++i) {
            a[i] = new TS();
        }

        int i = 0;
        int j = 0;
        while (sc.hasNext()) {
            j++;
            if (j % 4 == 1) {
                a[i].name = setName(sc.nextLine());
            }
            if (j % 4 == 2) {
                a[i].diemThi = sc.nextDouble();
                sc.nextLine();
            }
            if (j % 4 == 3) {
                a[i].dt= sc.nextLine();
            }
            if (j % 4 == 0) {
                a[i].kv = sc.nextInt();
                sc.nextLine();
                switch (a[i].kv) {
                    case 1:
                        a[i].uuTien = 1.5;
                        break;
                    case 2:
                        a[i].uuTien = 1;
                        break;
                    case 3:
                        a[i].uuTien = 0;
                        break;
                    default:
                        break;
                }
                if("Kinh".equals(a[i].dt))
                    a[i].uuTien += 0;
                else
                    a[i].uuTien += 1.5;
                a[i].code = "TS" + String.format("%02d", i + 1);
                a[i].tong = a[i].diemThi + a[i].uuTien;
                if(a[i].tong >= 20.5)
                    a[i].status = "Do";
                else
                    a[i].status = "Truot";
                ++i;
            }
        }
        
        List<TS> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, new Comparator<Diem_tuyen_sinh.TS>(){
            public int compare(TS x, TS y){
                if(x.tong != y.tong)
                    return Double.compare(y.tong, x.tong);
                return x.code.compareTo(y.code);
            }
        });
        for(TS e : arr)
            System.out.println(e);
    }
}
