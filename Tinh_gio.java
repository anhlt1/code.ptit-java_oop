package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Tinh_gio {
    public static class user{
        String code, name, gioVao, gioRa;
        int h, m;

        public user(String code, String name, String gioVao, String gioRa) {
            this.code = code;
            this.name = name;
            this.gioVao = gioVao;
            this.gioRa = gioRa;
            String[] a = gioVao.split(":");
            int gio1 = Integer.parseInt(a[0]);
            int phut1 = Integer.parseInt(a[1]);
            a = gioRa.split(":");
            int gio2 = Integer.parseInt(a[0]);
            int phut2 = Integer.parseInt(a[1]);
            m = phut2 - phut1;
            int nho = 0;
            while(m < 0)
            {
                nho++;
                m += 60;
            }
            h = gio2 - gio1 - nho;
        }

        @Override
        public String toString() {
            return code + " " + name + " " + h + " gio " + m + " phut";
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<user> a = new ArrayList<>();
        while(t --> 0)
            a.add(new user(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a, (user x, user y) -> Integer.compare(y.h * 60 + y.m, x.h * 60 + x.m));
        for(user e : a)
            System.out.println(e);
    }
}
