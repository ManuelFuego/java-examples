package control_functions;
/*
switch(statement) {
    case const1;
        instruction
        break;
    case const2;
        instruction
        break;
    case const3;
        instruction
        break;
    default:
        instruction
}
*/



public class switch_function {
    public static void main(String [] args){
        int i ;
        for (i=0;i <6; i++){
            switch (i) {
                case 0:
                    System.out.println("i =0");
                    break;
                case 1:
                    System.out.println("i =2");
                    break;
                case 2:
                    System.out.println("i =2");
                    break;
                case 3:
                    System.out.println("i =3");
                    break;
                case 4:
                    System.out.println("i =4");
                    break;
                default:
                    System.out.println("(default condition)i = " + i );

            }
        }
    }
}
