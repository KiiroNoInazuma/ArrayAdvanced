import java.util.Arrays;

public class Index_Max {
    public static void main(String[] args) {
        int check = 0;
        int index = 0;
        int indexMax = 0;
        int[] ind = RandomArray.randMet(12, -15, 15);
        while (index < ind.length) {
            for (int x : ind) {
                if (check < x) {
                    check = x;
                }
            }
            if (ind[index] == check) {
                if (indexMax < index) {
                    indexMax = index;
                }
            }
            index++;
        }
        System.out.println("Максимальное число в массиве: " + check);
        System.out.println("Индекс последнего вхождени в массив: " + indexMax);
        System.out.println(Arrays.toString(ind));


    }
}

/*Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.*/