import java.util.Arrays;
import java.util.Random;

public class Two_Dimensional_vol2 {
    public static void main(String[] args) {
        int max = 0;
        Random random = new Random();
        int[][] bigArray = new int[5][8];

        for (int i = 0; i < bigArray.length; i++) {
            for (int j = 0; j < bigArray[i].length; j++) {
                bigArray[i][j] = -99 + random.nextInt(198);
                if (max < bigArray[i][j]) {
                    max = bigArray[i][j];
                }
            }
        }
        for (int[] x : bigArray) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("____________________________________");
        System.out.println("Максимальный элемент массива - " + max);
    }
}





/*Напишите программу, которая генерирует двумерный массив из 5 строк
по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
Результат программы выведите в консоль. Отдельно выведите значение максимального
 элемента этого массива.*/