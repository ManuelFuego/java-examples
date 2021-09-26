package Lesson2;

import java.util.HashMap;
import java.util.Random;

public class SwitchCond {
    public static void main(String...args){
        HashMap<Integer, String> coloram = new HashMap<>();
        coloram.put(1,"green");
        coloram.put(2,"yellow");
        coloram.put(3,"red");
        Random random = new Random();
        int x = random.nextInt(coloram.size());
        switch (x){
            case (1):
                System.out.printf("please come here %s traffic light" ,coloram.get(1));
                break;
            case (2):
                System.out.printf("please wait %s traffic light" , coloram.get(2));
                break;
            default:
                System.out.printf("don't move %s traffic light" , coloram.get(3));
                break;
        }

    }
}
