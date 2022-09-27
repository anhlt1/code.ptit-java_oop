
package java_oop;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Boi_so_chung_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();
            System.out.println(lcm(a, b));
        }
    }
    public static BigInteger lcm(String a, String b){
        BigInteger s1 = new BigInteger(a);
        BigInteger s2 = new BigInteger(b);
        
        BigInteger mul = s1.multiply(s2);
        BigInteger gcd = s1.gcd(s2);
        BigInteger res = mul.divide(gcd);
        
        return res;
    }
}
