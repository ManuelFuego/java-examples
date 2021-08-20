package control_functions;

public class switch_inner {
    public  static void main(String [] args){
        int i ;
        for (i=0;i <6; i++){
            switch (i) {
                case 1:
                    System.out.println("outer branch switch");
                switch (2){
                    case 1:
                        System.out.println("inner branch switch" +1);
                        break;
                    case 2:
                        System.out.println("inner branch switch" + 2);
                case 3:
                    System.out.println("i = 3");
                    break;

                case 4:
                    System.out.println("i = 4");
                    break;
                default:
                    System.out.println("(default condition)i = " + i );

            }
        }
    }
    }
}
