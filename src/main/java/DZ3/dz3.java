package DZ3;

import java.util.*;

//Создать список типа ArrayList<String>. Поместить в него как строки, так
//и целые числа. Пройти по списку, найти и удалить целые числа.
public class dz3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("1");
        list.add("second");
        list.add("4");
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            try {
                int n = Integer.parseInt(list.get(i));
                list.remove(list.get(i));
                i=i-1;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(list);
    }
}
























