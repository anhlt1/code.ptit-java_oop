package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Day_uu_the {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            int e = 0;
            int o = 0;
            int n;
            for(int i = 0 ; i < a.length ; ++i)
            {
                n = Integer.parseInt(a[i]);
                if(n % 2 == 0)
                    ++e;
                else
                    ++o;
            }
            boolean c1 = false;
            boolean c2 = false;
            if((e > o) && (a.length % 2 == 0))
                c1 = true;
            else if ((o > e) && (a.length % 2 != 0))
                c2 = true;
            if(c1 || c2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
