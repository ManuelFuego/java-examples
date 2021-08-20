package control_functions;
/*
if (condition)
    instruction;
else if (condition)
    instruction;
else if (condition)
    instruction;
-
-
-
else
    instruction;
*/
public class if_else_multystep {
    public static void main(String [] args){
        int x ;

        for (x = 0 ;x < 7; x++) {
            if ( x==1 )
                System.out.println("x= "+ x);
            else if (x==2)
                System.out.println("x= "+ x);
            else if (x==3)
                System.out.println("x= "+ x);
            else if (x==4)
                System.out.println("x= "+ x);
            else
                System.out.println(x);
        }
    }

}
