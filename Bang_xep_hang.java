package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Bang_xep_hang {
    public static class SV{
        String name;
        int ac, sub;

        public SV() {
        }

        public SV(String name, String s) {
            this.name = name;
            String[] a = s.split(" ");
            this.ac = Integer.parseInt(a[0]);
            this.sub = Integer.parseInt(a[1]);
        }

        @Override
        public String toString() {
            return name + " " + ac + " " + sub;
        }
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SV> a = new ArrayList<>();
        while(t --> 0){
            String name = sc.nextLine();
            String s = sc.nextLine();
            a.add(new SV(name, s));
        }
        Collections.sort(a, (SV x, SV y) -> {
            if(x.ac != y.ac)
                return Integer.compare(y.ac, x.ac);
            else if(x.sub != y.sub)
                return Integer.compare(x.sub, y.sub);
            return x.name.compareTo(y.name);
        });
        for(SV i : a){
            System.out.println(i);
        }
    }
}
