package DZ3;

import java.util.*;
import java.util.stream.IntStream;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class dz2 {
    public static void main(String[] args) {
        int[] numbers = {2,6,16,5,1,1,3};
        Arrays.sort(numbers);
        System.out.printf("Максимальное число: %d", numbers[numbers.length-1]);
        Arrays.sort(numbers);
        System.out.printf("\nМинимальное число: %d", numbers[0]);
        OptionalDouble average= IntStream.of(numbers).average();
        System.out.println("\n");
        System.out.println(average);  // не знаю как вывести optionalDouble, через %f не получается
    }
}
