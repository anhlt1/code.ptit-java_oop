
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

public class Phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long uoc = gcd(a, b);
        System.out.print(a/uoc);
        System.out.print("/");
        System.out.print(b/uoc);
    }
    public static long gcd(long a, long b){
        if(b==0)
            return a;
        else 
            return gcd(b, a%b);
    }
}
