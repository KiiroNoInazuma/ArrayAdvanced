import java.util.Arrays;

public class FreqElement {
    public static void main(String[] args) {

        int[] unit = RandomArray.randMet(12, 0, 1);
        int check = 0;
        int count = 0;
        int result = 0;
        int num = 0;
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
        System.out.println("Число " + num + " встречается чаще всего, в количестве " + result + " раз.");
    }
}

