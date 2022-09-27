
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class So_dep_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s;
            s = sc.nextLine();
            if(check1(s) && check2(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    private static boolean check1(String s){
        char[] a = s.toCharArray();
        for(int i = 0 ; i < a.length/2 ; ++i)
            if(a[i] != a[a.length - i - 1])
                return false;
        return true;
        
    }
    private static boolean check2(String s){
        char[] a = s.toCharArray();
        for(int i = 0 ; i < a.length ; ++i)
            if((a[i] - '0') % 2 != 0)
                return false;
        return true;
    }
}