package java_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anhla
 */

class Time{
    int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
    
}

public class Sap_xep_thoi_gian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> a = new ArrayList<>();
        while(n --> 0){
            Time t = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            a.add(t);
        }
        Collections.sort(a, new Comparator<Time>(){
            @Override
            public int compare(Time x, Time y){
                if(x.h != y.h) 
                    return Integer.compare(x.h, y.h);
                if(x.m != y.m) 
                    return Integer.compare(x.m, y.m);
                if(x.s != y.s)
                    return Integer.compare(x.s, y.s);
                return 0;
            }
        });
        for(Time i : a)
            System.out.println(i.h + " " + i.m + " " + i.s);
    }
}
