
package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        boolean[] check = new boolean[1001];
        Arrays.fill(check, false);
        for(int i = 0 ; i < n ; ++i)
        {
            a[i] = sc.nextInt();
            check[a[i]]=true;
        }
        for(int i = 0 ; i < m ; ++i)
        {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for(int i = 0 ; i < m ; ++i)
            if(check[b[i]])
            {
                System.out.print(b[i] + " ");
                check[b[i]] = false;
            }
    }
}
