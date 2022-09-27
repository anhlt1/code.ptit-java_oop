
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long res = 1;
            for(int i = 1 ; i <= n ; ++i)
                res = lcm(res, i);
            System.out.println(res);
        }
    }
    public static long gcd(long a, long b){
        if(b==0)
            return a;
        else 
            return gcd(b, a%b);
    }
    public static long lcm(long a, long b){
        return a * b / gcd(a, b);
    }
}
