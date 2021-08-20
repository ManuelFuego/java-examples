package if_condition;

import java.io.IOException;

public class if_condition {
    public static void main(String args[]) throws IOException {
        int x = 56;
        int b ;
        System.out.println("enter b");
        b = System.in.read();
        if (x == b)System.out.println(" x equal b");
        if (x > b ) System.out.println("x greater");
        else if (x < b )System.out.println("x smaller");
    }
}
