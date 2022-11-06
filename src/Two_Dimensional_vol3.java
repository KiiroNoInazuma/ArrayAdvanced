import java.util.Arrays;

public class Two_Dimensional_vol3 {
    public static void main(String[] args) {
        int max = 0;
        int multi = 1;
        int index = 0;
        int[][] bigArray = new int[7][];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = RandomArray.randMet(4, -5, 5);
        }
        for (int x = 0; x < bigArray.length; x++) {
            for (int y = 0; y < bigArray[x].length; y++) {
                multi *= bigArray[x][y];
            }
            if (max < multi) {
                max = multi;
                index = x;
            }
            multi = 1;
            System.out.println(Arrays.toString(bigArray[x]));
        }
        System.out.println("Наибольшее произведение элементов (" + max + ") находится на " + (index + 1) + " строке.");
    }
}