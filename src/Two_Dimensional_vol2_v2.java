import java.util.Arrays;

public class Two_Dimensional_vol2_v2 {
    public static void main(String[] args) {
        int max = 0;
        int[][] bigArray = new int[5][];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = RandomArray.randMet(8, -99, 99);
        }
        for (int[] one : bigArray) {
            for (int two : one) {
                max = Math.max(max, two);
            }
            System.out.println(Arrays.toString(one));
        }
        System.out.println("Максимальное число массивов " + max);
    }
}
