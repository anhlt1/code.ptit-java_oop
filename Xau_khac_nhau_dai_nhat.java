package java_oop;

/**
 *
 * @author anhla
 */
import java.util.Scanner;

public class Xau_khac_nhau_dai_nhat {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            String a= scan.next();
            String b= scan.next();
            if(a.equals(b)) System.out.println("-1");
            else System.out.println(Math.max(a.length(),b.length()));
        }
    }
}
