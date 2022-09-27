package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class chuan_hoa_xau_ho_ten_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.equals("END"))
                break;
            else {
                line = line.trim();
                while(line.contains("  "))
                {
                    line = line.replace("  ", " ");
                }
                String[] name = line.split(" ");
                line = "";
                for(int i = 0 ; i < name.length ; ++i)
                    line += name[i].substring(0, 1).toUpperCase()
                            + name[i].substring(1).toLowerCase() + " ";
                line = line.trim();
                System.out.println(line);
            }
        }
    }
}
