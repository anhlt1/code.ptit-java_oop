package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anhla
 */

class MH{
    String code, name;
    int tc;

    public MH() {
    }

    public MH(String code, String name, int tc) {
        this.code = code;
        this.name = name;
        this.tc = tc;
    }
}

public class Danh_sach_mon_hoc {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\anhla\\OneDrive - anhlt01\\Documents\\NetBeansProjects\\Java_OOP\\src\\java_oop\\DATA.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        MH[] a = new MH[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new MH();
        String s;
        int t = 0;
        n = -1;
        while(sc.hasNextLine())
        {
            t++;
            s = sc.nextLine();
            if(t % 3 == 1)
            {
                ++n;
                a[n].code = s;
            }
            else if(t % 3 == 2){
                a[n].name = s;
            }
            else {
                a[n].tc = Integer.parseInt(s);
            }
        }
        List<MH> monhoc = new ArrayList<>();
        for(MH i : a)
            monhoc.add(i);
        Collections.sort(monhoc, new Comparator<MH>(){
            public int compare(MH x, MH y){
                return x.name.compareTo(y.name);
            }
        });
        for(MH i : monhoc)
            System.out.println(i.code + " " + i.name + " " + i.tc);
    }
}
