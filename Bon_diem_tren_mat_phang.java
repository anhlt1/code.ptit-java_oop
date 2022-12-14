package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class Point3D{
    
    int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        
        int a1 = b.x - a.x;
        int b1 = b.y - a.y;
        int c1 = b.z - a.z;
        int a2 = c.x - a.x;
        int b2 = c.y - a.y;
        int c2 = c.z - a.z;
        int fa = b1 * c2 - b2 * c1 ;
        int fb = a2 * c1 - a1 * c2 ;
        int fc = a1 * b2 - b1 * a2 ;
        int fd = (- fa * a.x - fb * a.y - fc * a.z) ;
        
        return (fa*d.x + fb*d.y + fc*d.z + fd) == 0;
        
    }
    
}

public class Bon_diem_tren_mat_phang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
