package control_functions;
/*
for (start; condition;iteration) instruction

for (start; condition;iteration)
{
 instruction
}

 */


public class for_cycles {
    public static void main(String args []){
        double num , sroot ,rerr ;
        for (num=1.0;num<100; num++){
            sroot = Math.sqrt(num);
            System.out.println("sqrt" + num + "==" + sroot);
        }

    }
}
