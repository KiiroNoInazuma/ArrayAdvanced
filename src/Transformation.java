import java.util.Arrays;

public class Transformation {

    public static void main(String[] args) {
        int[][] endMass = new int[6][];
        int index = 0;
        int maxNum = 0;
        int res;
        for (int i = 0; i < endMass.length; i++) {
            endMass[i] = RandomArray.randMet(7, 0, 9);
        }
        for (int[] mass : endMass) {
            for (int x = 0; x < mass.length; x++) {
                if (maxNum < mass[x]) {
                    maxNum = mass[x];
                    index = x;
                }
            }
        }
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("_______________________________");
        for (int end = 0; end < endMass.length; end++) {
            res = endMass[end][0];
            endMass[end][0] = maxNum;
            if (index != 0)
                endMass[end][index] = res;
            System.out.println(Arrays.toString(endMass[end]));
        }

    }
}
