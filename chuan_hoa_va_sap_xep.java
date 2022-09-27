package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class chuan_hoa_va_sap_xep {

    public static class Name {

        String ten, ho, dem, full;

        public Name(String name) {
            name = name.trim();
            while(name.contains("  "))
                name = name.replace("  ", " ");
            String[] c = name.split(" ");
            name = "";
            List<String> b = new ArrayList<>();
            for (String e : c) {
                e = e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase() + " ";
                name += e;
                b.add(e);
            }
            this.full = name;
            this.ten = b.get(b.size() - 1);
            this.ho = b.get(0);
            name = "";
            for (int i = 1; i < b.size(); ++i) {
                name += b.get(i);
            }
            this.dem = name;
        }

        @Override
        public String toString() {
            return full;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<Name> a = new ArrayList<>();
        while (sc.hasNext()) {
            a.add(new Name(sc.nextLine()));
        }
        Collections.sort(a, (Name x, Name o) -> {
            if (!x.ten.equals(o.ten)) {
                return x.ten.compareTo(o.ten);
            }
            if (!x.ho.equals(o.ho)) {
                return x.ho.compareTo(o.ho);
            }
            return x.dem.compareTo(o.dem);
        });
        for(Name e : a)
            System.out.println(e);
    }
}
