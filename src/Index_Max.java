import java.util.Arrays;

public class Index_Max {
    public static void main(String[] args) {
        int numMax = 0;
        int indexMax = 0;
        int numMin = 0;
        int indexMin = 0;
        int[] ind = RandomArray.randMet(12, -15, 15);
        for (int x = 0; x < ind.length; x++) {
            if (numMax <= ind[x]) {
                numMax = ind[x];
                indexMax = x;
            } else if (numMin >= ind[x]) {
                numMin = ind[x];
                indexMin = x;
            }
        }
        System.out.println("Максимальное число в массиве: " + numMax);
        System.out.println("Минимальное число в массиве: " + numMin);
        System.out.println("Индекс последнего вхождения максимального числа в массив: " + indexMax);
        System.out.println("Индекс последнего вхождения минимального числа в массив: " + indexMin);
        System.out.println(Arrays.toString(ind));

    }
}
