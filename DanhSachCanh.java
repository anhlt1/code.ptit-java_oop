
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class DanhSachCanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; ++i)
        {
            System.out.print("List(" + (i + 1) + ") = ");
            for(int j = 0 ; j < n ; ++j)
            {
                int x = sc.nextInt();
                if(x == 1)
                        System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }
}
