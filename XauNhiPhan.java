package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class XauNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long[] F = new long[93];
        F[0] = 0;
        F[1] = 1;
        for(int i = 2 ; i <= 92 ; ++i)
            F[i] = F[i-1] + F[i-2];
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            char c = FiboWord(n, k, F);
            System.out.println(c);
        }
    }
    public static char FiboWord(int n, long k, long[] F){
        if(n == 1) return 'A';
        if(n == 2) return 'B';
        if(k <= F[n-2]) return FiboWord(n-2, k, F);
        return FiboWord(n-1, k - F[n-2], F);
    }
            
}
