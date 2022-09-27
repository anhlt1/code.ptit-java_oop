package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class So_khac_nhau_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner scan=new Scanner(file);
        int[] M=new int[1001];
        Arrays.fill(M,0);
        while(scan.hasNext()){
            int x= scan.nextInt();
            M[x]++;
        }
        for(int i=0;i<1001;i++){
            if(M[i]>0) System.out.println(i+" "+M[i]);
        }
    }
}
