package java_oop;

import java.math.BigInteger;
import java.util.Scanner;



/**
 *
 * @author anhla
 */
public class TongSoNguyenLon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t --> 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
