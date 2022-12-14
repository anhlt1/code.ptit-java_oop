
package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class Point{
    
    //toa do x, y
    double x,y;
    
    //tao doi tuong mac dinh
    Point(){
        
        x = y = 0;
        
    }
    
    //tao doi tuong có toa do trong tham so
    Point(double a, double b){
        
        x = a;
        y = b;
        
    }
    
    //tao doi tuong la ban sao cua doi tuong trong tham so
    Point(Point a){
        
         x = a.x;
         y = a.y;
        
    }
    
    //tra ve toa do x
    public double getX(){
        
        return x;
        
    }
    
    //tra ve toa do y
    public double getY(){
        
        return y;
        
    }
    
    public double distance(Point a){
        
        return Math.sqrt((x-a.x) * (x-a.x) + (y-a.y) * (y-a.y));
        
    }
    
    public double distance(Point a, Point b){
        
        return Math.sqrt((b.y-a.x) * (b.y-a.x) + (b.y-a.y) * (b.y-a.y));
        
    }
    
    public String toString(){
        
        return String.valueOf(this);
        
    }
    
}

public class Khai_bao_lop_point {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            
            System.out.println(String.format("%.4f",a.distance(b)));

        }

        sc.close();
    }

}