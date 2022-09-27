package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class Rectange{
    
    int width, height;
    String color;
    
    Rectange(){
        width = height = 1;
    }
    
    Rectange (int a, int b, String c){
        width = a;
        height = b;
        c = c.toLowerCase();
        char f = c.charAt(0);
        f = Character.toUpperCase(f);
        String res = "";
        res += f;
        for(int i = 1 ; i < c.length() ; ++i){
            res += c.charAt(i);
        }
        color = res;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public int findArea(){
        return width*height;
    }
    
    public int findPerimeter(){
        return (width + height) * 2;
    }
    
}

public class Khai_bao_lop_hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        if (a > 0 && b > 0){
            Rectange r = new Rectange(a, b, c);
            System.out.print(r.findPerimeter());
            System.out.print(" ");
            System.out.print(r.findArea());
            System.out.print(" ");
            System.out.print(r.getColor());
        }
        else {
            System.out.println("INVALID");
        }
    }
}
