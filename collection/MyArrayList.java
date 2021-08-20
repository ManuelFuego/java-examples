package collection;

public class MyArrayList {
    //приватный массив array на 10 строк
    private String[] array = new String[10];
    // переменная size хранит количество элементов
    private int size = 0;

    // метод добавления в массив
    public void add(String s) {
        array[size] = s;
        size++;
        //проверка длины массива
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];

            }
            array = newArray;
        }
    }

    //удаление элемента из массива
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }
    public  void remove(String s){
        int index = -1;
        for (int i =0;i<size; i++){
            if (s.equals(array[i])){
                index = i;
                break;
            }
        }
        if (index != -1){
            remove(index);
        }

    }
    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }else {
            return "not found";
        }

    }
}