import java.util.Arrays;

public class FreqElement {
    static boolean bool;
    static int check;
    static int count;
    static int result;
    static int num;

    public static void main(String[] args) {

        int[] unit = RandomArray.randMet(12, 0, 1);

        while (count < unit.length) {
            for (int x : unit) {
                if (unit[count] == x) {
                    check++;
                    if (result < check) {
                        result = check;
                        num = x;
                    }
                }
            }
            count++;
            check = 0;
        }
        System.out.println(Arrays.toString(unit));


        count = 0;
        while (count < unit.length) {
            for (int x : unit) {
                if (unit[count] == x && unit[count] != num)
                    check++;
            }
            count++;
            if (result == check)
                bool = true;
            check = 0;
        }
        if (result == 1) {
            System.out.println("В массиве нет повторяющихся чисел");
        } else {
            if (bool) {
                System.out.println("В массиве есть несколько одинаковых, чаще остальных повторяющихся чисел");
            } else {
                System.out.println("Число " + num + " встречается чаще всего в количестве " + result + " раз.");
            }
        }
    }
}

