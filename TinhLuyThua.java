package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class TinhLuyThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b == 0)
                break;
            long mod = 1000000007;
            System.out.println(powerM1(a, b, mod));
//            powerM(a, b);
        }
    }
    public static void powerM(long a, long b){
        long mod = 1000000007;
        a %= mod;
        long res = 1;
        while(b > 0){
            if((b & 1) == 1)
                res = ((res % mod) * (a % mod)) % mod;
            a = ((a % mod) * (a % mod)) % mod;
            b >>= 1;
        }
        System.out.println(res);
    }
    public static long powerM1(long a, long b, long mod){
        if(b == 0)
            return 1;
        long x = powerM1(a, b/2, mod);
        if(b % 2 == 0)
            return ((x%mod) * (x%mod)) % mod;
        return a * (x * x % mod) % mod;
    }
}
