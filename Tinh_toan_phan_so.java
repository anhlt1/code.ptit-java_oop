package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class Phan_so{
    
    long x, y;

    public Phan_so() {
        x = y = 1;
    }
    
    private long gcd(long a, long b){
        if(b==0)
            return a;
        else 
            return gcd(b, a%b);
    }
    
    Phan_so(long a, long b) {
        long uoc = gcd(a, b);
        x = a/uoc;
        y = b/uoc;
    }
    
}

public class Tinh_toan_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            long x1 = sc.nextLong();
            long x2 = sc.nextLong();
            long x3 = sc.nextLong();
            long x4 = sc.nextLong();
            Phan_so a = new Phan_so(x1, x2);
            Phan_so b = new Phan_so(x3, x4);
            Phan_so res = new Phan_so(a.x * b.y + b.x * a.y, a.y * b.y);
            Phan_so c = new Phan_so(res.x * res.x, res.y * res.y);
            Phan_so d = new Phan_so(a.x * b.x * c.x, a.y * b.y * c.y);
            System.out.print(c.x + "/" + c.y + " ");
            System.out.println(d.x + "/" + d.y);
        }
    }
}
