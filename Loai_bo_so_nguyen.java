package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author anhla
 */
public class Loai_bo_so_nguyen {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\anhla\\OneDrive - anhlt01\\Documents\\NetBeansProjects\\Java_OOP\\src\\java_oop\\DATA.in");
        Scanner sc = new Scanner(f);
        Vector<String> v = new Vector<>();
        while(sc.hasNextLine())
        {
            String s = sc.nextLine();
            String[] a = s.split(" ");
            int num = 0;
            for(String i : a)
                try{
                    num = Integer.parseInt(i);
                } catch (NumberFormatException e){
                    v.add(i);
                }
        }
        Collections.sort(v);
        for(String i : v)
            System.out.print(i + " ");
    }
}
