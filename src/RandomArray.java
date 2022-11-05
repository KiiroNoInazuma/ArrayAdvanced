import java.util.Random;

public class RandomArray {
    public static int[] randMet(int length, int beginRange, int endRange) {
        Random random = new Random();
        int[] randMass = new int[length];
        for (int i = 0; i < randMass.length; i++) {
            randMass[i] = beginRange + random.nextInt(endRange - beginRange + 1);
        }
        return randMass;
    }
}
