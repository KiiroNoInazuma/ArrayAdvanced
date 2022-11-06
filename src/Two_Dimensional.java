import java.util.Arrays;

public class Two_Dimensional {
    public static void main(String[] args) {
        int[][] bigArray = new int[8][];
        for (int x = 0; x < bigArray.length; x++) {
            bigArray[x] = RandomArray.randMet(5, 10, 99);
        }
        for (int[] mass : bigArray) {
            System.out.println(Arrays.toString(mass));
        }
    }
}
