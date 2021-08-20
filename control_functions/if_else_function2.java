package control_functions;

import java.io.IOException;

public class if_else_function2 {
    public static void main(String [] args) throws IOException {
        /*
        if (i ==21){
            if (j < 20) a =b ;
            if (k > 100) c= d;
            else a = c ;

        }
        else a = d;
           */
     char ch ;
     char answer = 'k';
     System.out.println("some letter from a to z");
     System.out.print("try answer correctly ");
     ch = (char) System.in.read();
     if (ch == answer) System.out.println("you god damh right ");
     else {
         System.out.println("sorry dumbas ");
         if (ch< answer) System.out.println("closer to the beginning");
         else System.out.println("closer to the end ");
     }
    }
}
