package collection;
// массив не может изменить свой размер
//можно создать новый массив и вставить в него новые элементы
/*
public class main {
    public static void main(String[] args){
        String[] employees={
             "julia","bella","ann","ella"
        };

        //добавление в массив
        String[] second = new String[employees.length + 1];
        for (int i =0 ; i < employees.length; i++){
            second[i] = employees[i];
        }
        second[second.length -1] = "mila";
        employees = second;
        //удаление из массива
        employees[0] = null;
        employees[3] = null;
        //добавление из массива employees в массив new_names
        String[] new_names = new String[employees.length -1];
        for (int i=0, j=0 ; i <employees.length; i ++) {
            if (employees[i] != null) {
                new_names[j] = employees[i];
                j++;
            }
        }
        //вывод элементов массива
        for (String name: employees){
            System.out.println(name);
        }
    }
}
*/

public class Main {
    public static void main(String[] args){
        MyArrayList employees = new MyArrayList();
        employees.add("bella");
        employees.add("julie");
        employees.add("anna");
        employees.add("tom");
        employees.add("gaga");
        employees.remove(4);
        employees.remove("fmsk");
        for (int i = 1 ; i < 100; i ++){
            employees.add("employyes "+ i);
        }
        for (int i = 0; i < employees.getSize(); i ++){
            System.out.println(employees.get(i));
        }


    }
}