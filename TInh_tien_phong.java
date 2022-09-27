package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author anhla
 */
public class TInh_tien_phong {

    public static class KH {

        String name, soPhong, ngayDen, ngayDi, code;
        int tien, days, thanhTien, donGia;

        public KH() {
        }

        public long getThanhTien() {
            return thanhTien;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + soPhong + " " +
                    days + " " + thanhTien;
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
    
    public static String setDate(String s) {
        if(s.charAt(1) == '/')
            s = "0" + s;
        if(s.charAt(4) == '/')
            s = s.substring(0, 3) + "0" + s.substring(3);
        return s;
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = 0;
        while(sc.hasNext())
        {
            n = Integer.parseInt(sc.nextLine());
            break;
        }
        KH[] arr = new KH[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = new KH();
        }
        int i = 0;
        int j = 0;
        while (sc.hasNext()) {
            j++;
            if (j % 5 == 1) {
                arr[i].name = setName(sc.nextLine());
            }
            if (j % 5 == 2) {
                arr[i].soPhong = sc.nextLine();
            }
            if (j % 5 == 3) {
                arr[i].ngayDen = setDate(sc.nextLine());
            }
            if (j % 5 == 4) {
                arr[i].ngayDi = setDate(sc.nextLine());
            }
            if (j % 5 == 0) {
                arr[i].tien = Integer.parseInt(sc.nextLine());
                arr[i].code = "KH" + String.format("%02d", i + 1);
                Date den = new SimpleDateFormat("dd/MM/yyyy").parse(arr[i].ngayDen);
                Date di = new SimpleDateFormat("dd/MM/yyyy").parse(arr[i].ngayDi);
                arr[i].days = (int) ((di.getTime() - den.getTime()) / (1000 * 60 * 60 * 24)) % 365 + 1;
                switch (arr[i].soPhong.charAt(0)) {
                    case '1':
                        arr[i].donGia = 25;
                        break;
                    case '2':
                        arr[i].donGia = 34;
                        break;
                    case '3':
                        arr[i].donGia = 50;
                        break;
                    default:
                        arr[i].donGia = 80;
                        break;
                }
                arr[i].thanhTien = arr[i].donGia * arr[i].days + arr[i].tien;
                ++i;
            }
        }
        List<KH> a = new ArrayList<>();
        a.addAll(Arrays.asList(arr));
        a.sort(Comparator.comparing(KH::getThanhTien).reversed());
        for(KH e : a)
            System.out.println(e);
    }
}
