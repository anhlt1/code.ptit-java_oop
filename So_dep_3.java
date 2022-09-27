
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class So_dep_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s;
            s = sc.nextLine();
            if(check(s) && isPalindrome(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
    private static boolean check(String s){
        char[] a = s.toCharArray();
        for(int i = 0 ; i < a.length ; ++i)
        {
            char c = a[i];
            if(c != '2' && c != '3' && c != '5' && c != '7')
                return false;
        }
        return true;
    }
    
    private static boolean isPalindrome(String s){
        char[] a = s.toCharArray();
        for(int i = 0 ; i < a.length/2 ; ++i)
            if(a[i] != a[a.length - i - 1])
                return false;
        return true;
    }
}
