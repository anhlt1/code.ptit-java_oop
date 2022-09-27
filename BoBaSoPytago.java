package java_oop;

import java.util.Arrays;
import java.util.Scanner;

public class Java_OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0 ; i < n ;++i)
            {
                long x = sc.nextLong();
                a[i] = x * x;
            }
            Arrays.sort(a);
            if(check(a, n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean check(long [] a, int n){
        for(int i = n - 1; i >= 2 ; --i)
        {
            int l = 0 ;
            int r = i - 1;
            while(l < r){
                if( a[l] + a[r] == a[i])
                    return true;
                else if(a[l] + a[r] < a[i])
                    l++;
                else 
                    r--;
            }
        }
        return false;
    }
}