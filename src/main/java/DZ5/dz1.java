package DZ5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class dz1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phonebook= new  HashMap<>();
        phonebook.put("Ivanov", new ArrayList<>(Arrays.asList(9872654, 98765231,31672361)));
        phonebook.put("Petrov", new ArrayList<>(Arrays.asList(987654, 9831231,31672361)));
        phonebook.put("Vasiliev", new ArrayList<>(Arrays.asList(982327654, 98765231,313672361)));
        phonebook.put("Fedotov", new ArrayList<>(Arrays.asList(987654, 98311231,31672361)));

        for (String key : phonebook.keySet()) {
            System.out.println(key + ": "+ phonebook.get(key));
            System.out.println();
    }
}}
