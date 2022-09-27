//doc file va in ra
package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Doc_file_van_ban {

    public static void main(String[]args) throws FileNotFoundException {
        File file = new File("DATA.in"); //import java.io.File;
	Scanner sc = new Scanner(file); //import java.io.FileNotFoundException;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
    
}