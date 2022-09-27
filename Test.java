package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fac = 1;
        long sum = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            fac *= i;
            sum += fac;
        }
        System.out.println(sum);
    }
}
