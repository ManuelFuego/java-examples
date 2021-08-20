package control_functions;

import java.io.IOException;

public class if_else_function {
    public static void main (String [] args) throws IOException {
        int laptop_int = 53;
        int guest_int ;
        System.out.println("enter secret number: ");
        guest_int = (int) System.in.read();
        if (guest_int == laptop_int){
            System.out.println("good");
        }else {
            System.out.println("bad");
        }
    }
}
