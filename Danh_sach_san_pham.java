package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author anhla
 */
public class Danh_sach_san_pham {
    public static class SP{
        String code, name;
        int price, ins;

        public SP() {
        }

        @Override
        public String toString() {
            return code + " " + name + " " + price
                    + " " + ins;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SANPHAM.in");
        Scanner sc = new Scanner(f);
        int n = 0;
        while(sc.hasNext()){
            n = Integer.parseInt(sc.nextLine());
            break;
        }
        SP[] a= new SP[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new SP();
        int i = 0, j = 0;
        while(sc.hasNext()){
            j++;
            if(j % 4 == 1)
                a[i].code = sc.nextLine();
            if(j % 4 == 2)
                a[i].name = sc.nextLine();
            if(j % 4 == 3)
                a[i].price = sc.nextInt();
            if(j % 4 == 0)
            {
                a[i].ins = sc.nextInt();
                sc.nextLine();
                i++;
            }
        }
        List<SP> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (SP x, SP y) -> {
            if(x.price != y.price)
                return Integer.compare(y.price, x.price);
            return x.code.compareTo(y.code);
        });
        for(SP e : arr)
            System.out.println(e);
    }
}
