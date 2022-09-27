package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0)
        {
            String s = sc.next();
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0 ; i < s.length() ; ++i)
                if(i % 2 == 0)
                    sum1 += s.charAt(i) - '0';
                else
                    sum2 += s.charAt(i) - '0';
            sum1 -= sum2;
            if(sum1 % 11 == 0)
                System.out.println(1);
            else System.out.println(0);
        }
    }
}
