package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class Point{
    
    double x,y;
    
    Point(double a, double b){
        
        x = a;
        y = b;
        
    }
    
    public double distance(Point a){
        
        return Math.sqrt((x-a.x) * (x-a.x) + (y-a.y) * (y-a.y));
        
    }
    
    public static Point nextPoint(Scanner sc){
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    
}

class Triangle{
    
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid(){
        double x = a.distance(b);
        double y = a.distance(c);
        double z = b.distance(c);
        if(x + y > z && x + z > y && z + y > x)
            return true;
        else
            return false;
    }
    
    public String getPerimeter(){
        double x = a.distance(b);
        double y = a.distance(c);
        double z = b.distance(c);
        return String.format("%.3f", x+y+z);
    }
    
}

public class Lop_triaangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
