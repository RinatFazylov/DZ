package DZ3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class dz1 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("Первоначальный массив :" + numbers);

        List<Integer> result = numbers.stream()
                .map(s -> Integer.valueOf(s))
                .filter(number -> number % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Результат: " + result);

    }

}











