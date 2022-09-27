package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Tinh_tong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long sum = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            sum += Sum(line);
        }
        System.out.println(sum);
    }
    private static long Sum(String s){
        int sum = 0;
        String[] a = s.split(" ");
        for(int i = 0 ; i < a.length ; ++i)
            try {
                sum += Integer.parseInt(a[i]);
            } catch (NumberFormatException e) {
            }
        return sum;
    }
}
