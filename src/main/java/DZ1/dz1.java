package DZ1;
//Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class dz1 {
    public static void main(String[] args) {
        int[] arr = {11,221,33,3,5};
        int min = arr[0];
        int max = arr[0];
        for (int num: arr) {
            if (num<min){
                min=num;
            }
            if (num>max){
                max=num;
            }
        }
        System.out.printf("Минимальное значение:", min);    //почемуто не выводит без 17 строки
        System.out.println(min);
        System.out.printf("Максимальное значение:", max);
        System.out.println(max);
    }
}