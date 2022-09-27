package java_oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] check = new boolean[201];
        Arrays.fill(check, false);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; ++i)
        {
            int x = sc.nextInt();
            if(x > max) max = x;
            check[x] = true;
        }
        int cnt = 0;
        for(int i = 1 ; i <= max ; ++i)
            if(!check[i])
            {
                ++cnt;
                System.out.println(i);
            }
        if(cnt == 0)
            System.out.println("Excellent!");
    }
}
