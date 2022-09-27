package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class TS{
    String name, dob;
    int code;
    float x, y, z, sum;

    public TS() {
    }
    
}

public class Tim_thu_khoa_ky_thi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TS[] a = new TS[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new TS();
        String s = "";
        float d = 0;
        float res = Float.MIN_VALUE;
        for(int i = 0 ; i < n ; ++i)
        {
            a[i].code = i+1;
            for(int j = 1 ; j <= 5 ; ++j)
            {
                if(j <= 2) s = sc.nextLine();
                else {
                    d = sc.nextFloat();
                }
                if(j % 5 == 1)
                    a[i].name = s;
                if(j % 5 == 2)
                    a[i].dob = s;
                if(j % 5 == 3)
                    a[i].x = d;
                if(j % 5 == 4)
                    a[i].y = d;
                if(j % 5 == 0)
                    a[i].z = d;
                if(j == 5)
                {
                    a[i].sum = a[i].x + a[i].y + a[i].z;
                    if(a[i].sum > res) res = a[i].sum;
                    sc.nextLine();
                }
            }
        }
        for(TS i : a)
            if(i.sum == res)
                System.out.println(i.code+" "+i.name+" "+
                        i.dob+" "+res);
    }
}
