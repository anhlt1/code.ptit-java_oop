
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class DiemCanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            long x;
            for(int i = 0 ; i < n ; ++i)
            {
                x = sc.nextLong();
                sum += x;
                a[i] = sum;
            }
            int res = 1;
            boolean check = false;
            for(int i = 1 ; i < n - 1 ; ++i)
            {
                long l = a[i-1];
                long r = a[n-1] - a[i];
                if(l == r)
                {
                    check = true;
                    res = i;
                    break;
                }
            }
            if(check)
                System.out.println(res+1);
            else 
                System.out.println(-1);
        }
    }
}
