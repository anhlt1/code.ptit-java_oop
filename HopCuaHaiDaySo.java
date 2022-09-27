
package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x;
        TreeSet<Integer> s = new TreeSet<>();
        for(int i = 0 ; i < n ;++i)
        {
            x = sc.nextInt();
            s.add(x);
        }
        for(int i = 0 ; i < m ; ++i)
        {
            x = sc.nextInt();
            s.add(x);
        }
        for(int i : s)
            System.out.print(i + " ");
    }
}
