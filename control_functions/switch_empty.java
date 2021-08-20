package control_functions;

public class switch_empty {
    public static void main(String [] args){
        int i ;
        for (i=0;i <6; i++){
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i = 1,2,3 or 4");
                    break;
                default:
                    System.out.println("(default condition)i = " + i );

            }
        }
    }
}
