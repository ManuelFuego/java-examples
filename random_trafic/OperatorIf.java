package Lesson2;

import java.util.HashMap;
import java.util.Random;

public class OperatorIf {
    public static void main(String...args){
        HashMap <Integer, String>colors  = new HashMap<>();
        colors.put(1,"green");
        colors.put(2,"yellow");
        colors.put(3,"red");
        colors.put(4,"x");
        Random randomColorIndex = new Random();
        int index = randomColorIndex.nextInt(colors.size());

        OperatorIf operatorIf = new OperatorIf();
        operatorIf.move(index);

    }

    void move(int index){
        if (index == 1)
            System.out.println("you can move across the road");
        else if (index==2)
            System.out.println("please wait");
        else if(index==3)
            System.out.println("please dont move");
        else
            System.out.println("wsd");
    }

}
