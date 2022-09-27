
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Chuan_hoa_xau_ho_ten {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s;
            s = sc.nextLine();
            standard(s);
        }
    }
    
    public static void standard(String s){
        s = s.trim();
        while(s.contains("  ") == true){
            s = s.replace("  ", " ");
        }
        String[] name = s.split(" ");
        s = "";
        for(int i = 0 ; i < name.length ; ++i)
        {
            s += name[i].substring(0, 1).toUpperCase() + 
                    name[i].substring(1).toLowerCase() + " ";
        }
        s = s.trim();
        System.out.println(s);
    }
    
}
