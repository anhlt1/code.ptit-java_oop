package java_oop;

import java.util.Scanner;

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

public class Chu_vi_tam_giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double x4 = sc.nextDouble();
            double x5 = sc.nextDouble();
            double x6 = sc.nextDouble();
            Point a = new Point(x1, x2);
            Point b = new Point(x3, x4);
            Point c = new Point(x5, x6);
            double x = a.distance(b);
            double y = a.distance(c);
            double z = b.distance(c);
            if(x + y > z && x + z > y && z + y > x){
                System.out.println(String.format("%.3f", x+y+z));
            }
            else
                System.out.println("INVALID");
        }
    }
}
