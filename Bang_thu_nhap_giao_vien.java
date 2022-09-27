package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Bang_thu_nhap_giao_vien {
    public static class GV{
        String code, name, pos;
        int luongCB, phuCap, heSo, thuNhap;

        public GV(String code, String name, int luongCB) {
            this.code = code;
            this.pos = code.substring(0, 2);
            
            if("HT".equals(pos))
                phuCap = 2000000;
            else if ("HP".equals(pos))
                phuCap = 900000;
            else 
                phuCap = 500000;
            
            this.name = name;
            this.luongCB = luongCB;
            this.heSo = Integer.parseInt(code.substring(2));
            thuNhap = luongCB * heSo + phuCap; 
        }

        @Override
        public String toString() {
            return code + " " + name + " " + heSo + " " + 
                    phuCap + " " + thuNhap;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<GV> a = new ArrayList<>();
        while(t --> 0)
            a.add(new GV(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        int cnt = 0;
        int cnt1 = 0;
        for(GV e : a)
            if("HT".equals(e.pos))
            {
                cnt++;
                if(cnt <= 1)
                    System.out.println(e);
            }
            else if ("HP".equals(e.pos))
            {
                cnt1++;
                if(cnt1 <= 2)
                    System.out.println(e);
            }
            else 
                System.out.println(e);
    }
}
