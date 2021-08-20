package control_functions;

public class for_cycle_negative {
    public static void main(String[] args) {
        double start;
        /*
        for (start = 100; start > -100; start -= 5) {
            System.out.println(start);
        }

         */
        System.out.println("if condition");
        for (start=100; start > -100; start -=5){
            if(start % 2 == 0){
                System.out.println(start);
            }
        }
    }
}

