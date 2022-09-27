
package java_oop;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Hieu_so_nguyen_lon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger x = a.subtract(b);
            x = x.abs();
            String res = x.toString();
            
            String s1 = a.toString();
            String s2 = b.toString();
            
            int max = Math.max(s1.length(), s2.length());
            while(res.length() < max)
                res = "0" + res;
            System.out.println(res);
        }
    }
}