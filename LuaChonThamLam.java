
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class LuaChonThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        SmallestNum(n, s);
        System.out.print(" ");
        LargestNum(n, s);
    }
    public static void LargestNum(int n, int s){
        if(s == 0)
        {
            System.out.print(n == 1 ? "0" : "-1");
            return;
        }
        if(s > 9*n)
        {
            System.out.print("-1");
            return;
        }
        int[] res = new int[n];
        for(int i = 0 ; i < n ; ++i)
        {
            if(s >= 9)
            {
                res[i] = 9;
                s -= 9;
            }
            else
            {
                res[i] = s;
                s = 0;
            }
        }
        for(int i = 0 ; i < n ; ++i)
            System.out.print(res[i]);
    }
    public static void SmallestNum(int n, int s){
        if(s == 0)
        {
            System.out.print(n == 1 ? "0" : "-1");
            return;
        }
        if(s > 9*n)
        {
            System.out.print("-1");
            return;
        }
        int[] res = new int[n];
        s -= 1;
        for(int i = n - 1 ; i > 0 ; --i)
        {
            if(s > 9)
            {
                res[i] = 9;
                s -= 9;
            }
            else {
                res[i] = s;
                s = 0;
            }
        }
        res[0] = s + 1;
        for(int i = 0 ; i < n ; ++i)
            System.out.print(res[i]);
    }
}
