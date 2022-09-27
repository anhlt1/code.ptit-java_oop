
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class LietKeToHop_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[11];
        for(int i = 1 ; i <= k ; ++i)
            a[i] = i;
        boolean check = true;
        int res = 0;
        while(check){
            ++res;
            for(int i = 1 ; i <= k ; ++i)
                System.out.print(a[i]);
            System.out.print(" ");
            int i = k;
            while(i > 0 && a[i] == n - k + i)
                --i;
            if(i == 0)
                check = false;
            else {
                a[i]++;
                for(int j = i + 1 ; j <= k ; ++j)
                    a[j] = a[j - 1] + 1;
            }
        }
        System.out.println("\nTong cong co " + res + " to hop");
    }
}
