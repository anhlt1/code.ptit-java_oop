package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */

class Sophuc{
    int a, b;

    public Sophuc() {
    }

    public Sophuc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public static Sophuc Sum(Sophuc x, Sophuc y){
        Sophuc t = new Sophuc(x.a + y.a, x.b + y.b);
        return t;
    }
    
    public static Sophuc Multiple(Sophuc x, Sophuc y){
        Sophuc t = new Sophuc(x.a*y.a - x.b*y.b, x.b*y.a + x.a*y.b);
        return t;
    }
    
    @Override
    public String toString(){
        
        String s = "";
        s += a;
        if(b > 0)
            s += " + " + b + "i";
        else
            s += " - " + (-b) + "i";
        return s;
        
    }
    
}

public class So_phuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            Sophuc x = new Sophuc(sc.nextInt(), sc.nextInt());
            Sophuc y = new Sophuc(sc.nextInt(), sc.nextInt());
            Sophuc tong = Sophuc.Sum(x, y);
            Sophuc res1 = Sophuc.Multiple(tong, x);
            System.out.print(res1);
            System.out.print(", ");
            Sophuc res2 = Sophuc.Multiple(tong, tong);
            System.out.println(res2);
        }
    }
}
