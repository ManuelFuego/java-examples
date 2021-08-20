package control_functions;

import java.io.IOException;

public class read_symbols_from_keyboard {
    public static void main(String [] args) throws IOException {
        char ch ;
        System.out.println("press key and press enter");
        ch = (char)System.in.read();
        System.out.println("press " + ch);

    }
}
